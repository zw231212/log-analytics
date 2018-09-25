package cn.org.escience.log.ddsdb.connection;

import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import cn.org.escience.log.ddsdb.utils.JdbcUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import javax.sql.DataSource;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据源与数据源相关的连接的主控制器。存储的时候根据datasource 的url来作为id存储datasource,
 * 在存储connections的时候根据connection 的id 作为key存储conn。
 * 但是要获取connection的必须先获取datasource,然后再以datasource作为key来获取connections。（这个key好么？后期有优化再说吧）
 * (1)如果长久没有使用，那么就释放资源，定时调度的任务，定时去释放没有使用的
 * (2)大量的连接的时候，数据库有1000+，连接每个有100个的时候的操作会怎么样？
 */
@Data
public class ConnectionHolder {

  private static final Logger logger = LoggerFactory.getLogger(ConnectionHolder.class);

  /**
   * 维护数据源
   */
  private static Map<String, DataSource> dataSources = new HashMap<>();
  /**
   * 维护数据源相关的连接
   */
  private static Map<DataSource, Map<Integer,Connection>> connections = new HashMap<>();

  private static ConnectionHolder connHolder = null;

  private ConnectionHolder(){}


  public static ConnectionHolder getInstance() {
    if(connHolder == null){
      synchronized (ConnectionHolder.class){
        if(connHolder==null){
          return new ConnectionHolder();
        }
      }
    }
    return connHolder;
  }

  public DataSource getDataSource(String id) {
    return dataSources.get(id);
  }

  public Map<Integer,Connection> getConnections(DataSource dataSource) {
    return connections.get(dataSource);
  }

  /**
   * 给一个dds添加一个新的连接。
   * @param conn 连接
   * @param dds 动态数据源
   * @return
   */
  public boolean addConnction(Connection conn, DynamicDataSource dds) {

    if(conn == null){
      return false;
    }

    if(dds == null || dds.getUrl() == null || "".equals(dds.getUrl().trim())){
      return false;
    }
    try{
      //数据源是否存在进行检查
      dataSources.putIfAbsent(dds.getUrl(), dds);
      //数据源里，是否有足够的连接，如果还能添加就添加，不能添加就放弃。

      Map<Integer, Connection> ddsConns = connections.get(dds);
      int hashKey = conn.hashCode();
      if(ddsConns==null || ddsConns.size()==0){
        if(ddsConns == null){
          ddsConns = new HashMap<>();
        }
        ddsConns.put(hashKey,conn);
      }else{

        int connSize = ddsConns.size();

        if(connSize < dds.getMaxConn()){
          ddsConns.put(hashKey,conn);
        }else{//满了就不添加了，直接释放传入的连接
          conn.close();
          logger.warn("连接最大数已满，请直接获取连接！");
          return false;
        }
      }
      return true;
    } catch (Exception e){ //如果加入失败，当前的conn将被释放，也就是无法获取
      e.printStackTrace();
      try {
         conn.close();
      } catch (SQLException e1) {
        e1.printStackTrace();
      }
    }
    return false;
  }

  /**
   * 获取数据库一个数据库的链接
   * @param dds
   * @return
   */
  public Connection getConnection(DynamicDataSource dds){
    if(dds == null){
      logger.warn("数据源配置信息为空！");
      return null;
    }

    DataSource existedDds = dataSources.get(dds.getUrl());
    Map<Integer,Connection> existedConns = null;
    if(existedDds != null){
      existedConns  = connections.get(dds);
      if(existedConns != null && existedConns.size() > 0){
        int exisedConnSize = existedConns.size();
        Integer maxConn = dds.getMaxConn();
        if(maxConn <= exisedConnSize){//已经满了
          /**
           * 获取的时候我们没有看是否被占用了，或者别的正在使用这样的情况
           * 随机拿一个连接过来，不过我们都只是查询，对于conn别人是否在用是否有影响？
           */
          Collection<Connection> connValues = existedConns.values();
          Optional<Connection> anyConn = connValues.stream().findAny();
          if(anyConn.isPresent()){
            return anyConn.get();
          }
          //上面如果有错误还是拿下面的这样的来获取一个连接
          int randomIndex = new Random().nextInt(exisedConnSize);
          Connection[] connArr = new Connection[exisedConnSize];
          return connValues.toArray(connArr)[randomIndex];
        }
      }




    }
    return getConnectionFromDatabase(dds);

  }

  private Connection getConnectionFromDatabase(DynamicDataSource dds){
    Connection newConn = JdbcUtil.getConnection(dds);
    if(newConn == null){
      return null;
    }
    /**
     * 将连接放入缓存
     */
    boolean result = addConnction(newConn, dds);
    if(result){
      logger.info("在新的数据源中添加了一条数据库的连接");
    }
    return newConn;
  }

  public boolean doCloseConnectionIfNecessary(Connection con, DynamicDataSource dds) throws SQLException {
    if (con == null) {
      return false;
    }

    if(dds == null){
      return false;
    }

    DataSource tempDds = dataSources.get(dds.getUrl());
    if (tempDds == null) {
      return false;
    }
    Map<Integer,Connection> ddsConnMap = connections.get(dds);
    if(ddsConnMap == null || ddsConnMap.size() == 0){
      return false;
    }

    if(dds.getMaxConn() > ddsConnMap.size()){//还没有达到最大的限制，那么就不释放当前的连接
      return false;
    }

    int conHashKey = con.hashCode();
    boolean containFlag = ddsConnMap.containsKey(conHashKey);
    if(!containFlag){
      return false;
    }
    try{
      ddsConnMap.remove(conHashKey);
      JdbcUtil.release(con);
    }catch (Exception e){
      logger.error("移除连接资源失败！");
      return false;
    }
    //存在资源那么最后就释放吧
    return true;

  }

}
