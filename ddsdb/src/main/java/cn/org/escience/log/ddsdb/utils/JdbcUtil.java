package cn.org.escience.log.ddsdb.utils;

import cn.org.escience.log.ddsdb.model.DataSourceConstant;
import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JdbcUtil {

  private static final Logger logger = LoggerFactory.getLogger(JdbcUtil.class);

  /**
   * 查看数据库是否存在
   * @param dds 数据源信息
   * @return
   */
  public static boolean existsDatabase(DynamicDataSource dds){
    Connection conn = getConnection(dds);
    boolean flag = conn != null;
    releaseConnection(flag,conn,dds);
    return flag;
  }

  /**
   * 释放连接资源,将资源的释放放在这里
   * @param flag
   * @param conn
   * @param dds
   */
  private static void releaseConnection(boolean flag, Connection conn, DynamicDataSource dds){
    if(flag){
      release(conn);
    }
  }

  /**
   * 释放资源
   * @param conn
   * @param sta
   * @param rs
   */
  public static void release(Connection conn, Statement sta,ResultSet rs){
    try {
      if (rs!=null) {
          rs.close();
          rs = null;
      }
      if (sta!=null) {
          sta.close();
          sta = null;
      }
      if (conn!=null) {
          conn.close();
          conn = null;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * 释放资源
   * @param conn
   * @param sta
   */
  public static void release(Connection conn,Statement sta){
      release(conn, sta,null);
  }

  /**
   * 释放资源
   * @param conn
   */
  public static void release(Connection conn){
    release(conn, null,null);
  }


  /**
   * 创建数据库如果数据库不存在！
   * @param dds 数据源信息
   * @return
   */
  public static boolean createDatabaseIfNotExisted(DynamicDataSource dds){
    String url = dds.getUrl();
    if(url.contains("?")){
      url += "&";
    } else{
      url += "?";
    }
    url += "createDatabaseIfNotExist=true";
    dds.setUrl(url);
    Connection conn = getConnection(dds);
    try{
      conn.commit();
    }catch (Exception e){
      e.printStackTrace();
      return false;
    }
    boolean flag = conn!=null;
    releaseConnection(flag,conn,dds);
    return flag;
  }

  /**
   * 判断数据库表是否存在
   * @param dds
   * @param table
   * @return
   */
  public static boolean existsTable(DynamicDataSource dds,String table){
    Connection conn = getConnection(dds);
    if(conn == null){
      return false;
    }

    /**
     * 配置信息见：
     * http://sjsky.iteye.com/blog/1119394
     */
    try {
      ResultSet rs = conn.getMetaData().getTables(dds.getDatabase(), null, table, new String[]{"TABLE"});
      boolean flag = rs.next();
      if(!flag){
          logger.error("数据库表信息查询错误，表[ "+table+" ]不存在");
      }
      return flag;
    } catch (SQLException e) {
      e.printStackTrace();
      logger.error("数据库表信息查询错误，表[ "+table+" ]不存在");
    }
    
    return false;
  }

  public static boolean createTableIfNotExisted(DynamicDataSource dds,String table,String tableSql){
    Connection conn = getConnection(dds);
    if(conn == null){
      return false;
    }

    String sql = "";

    return false;
  }


  /**
   * 加载驱动
   */
  public static Driver getDriver(String driverClass){
    if(driverClass == null || "".equals(driverClass.trim())){
      driverClass = DataSourceConstant.DEFAULT_DRIVERCLASS;
    }
    try {
      Class<?> aClass = Class.forName(driverClass);
      Driver driver = (Driver) aClass.newInstance();
      return driver;
    } catch (Exception e) {
      logger.error("数据库驱动信息加载失败，如果驱动比较高，可以自动加载驱动，不会影响使用！");
      e.printStackTrace();
      return null;
    }
  }

  /**
   * 获取连接
   * @return
   */
  public static Connection getConnection(DynamicDataSource dds) {

    // 加载驱动
    Driver driver = getDriver(dds.getDriverClass());
    if(driver == null){
      driver = getDriver(DataSourceConstant.DEFAULT_DRIVERCLASS);
    }
    try {
      // 获取连接
      DriverManager.registerDriver(driver);
      Connection conn = DriverManager
          .getConnection(dds.getUrl(), dds.getUser(), dds.getPass());
      return conn;
    } catch (SQLException e) {
      e.printStackTrace();
      logger.error("数据库连接失败！"+dds.getUrl());
    }
    return null;
  }

}
