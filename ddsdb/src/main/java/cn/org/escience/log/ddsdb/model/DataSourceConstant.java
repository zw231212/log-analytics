package cn.org.escience.log.ddsdb.model;

import cn.org.escience.log.ddsdb.config.DBPropertyLoader;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceConstant {

  private static final Logger logger = LoggerFactory.getLogger(DataSourceConstant.class);
  //关键字定义
  protected static final String DB_HOST_KEY = "host";
  protected static final String DB_PORT_KEY = "port";
  protected static final String DB_USER_KEY = "user";
  protected static final String DB_PASS_KEY = "pass";
  protected static final String DB_DIALECT_KEY = "dialect";
  protected static final String DB_QUERYSTRING_KEY = "querystring";
  protected static final String DB_DATABASE_KEY = "database";
  protected static final String DB_DRIVER_CLASS_KEY = "driverClass";
  protected static final String DB_MAXCONN_KEY = "maxConn";
  protected static final String DB_MINCONN_KEY = "minConn";
  protected static final String DB_DEFAULT_DATABASE_KEY = "defaultDatabase";

  //默认固定值配置读取
  public static String DEFAULT_HOST = DBPropertyLoader.get(DB_HOST_KEY);
  public static Integer DEFAULT_PORT = 3306;
  public static String DEFAULT_USER = DBPropertyLoader.get(DB_USER_KEY);
  public static String DEFAULT_PASS = DBPropertyLoader.get(DB_PASS_KEY);
  public static String DEFAULT_DIALECT = DBPropertyLoader.get(DB_DIALECT_KEY);
  public static String DEFAULT_QUERYSTRING = DBPropertyLoader.get(DB_QUERYSTRING_KEY);
  public static String DEFAULT_DRIVERCLASS = DBPropertyLoader.get(DB_DRIVER_CLASS_KEY);
  public static String DEFAULT_DATABASE = DBPropertyLoader.get(DB_DEFAULT_DATABASE_KEY);
  public static Integer DEFAULT_MAXCONN = 10;
  public static Integer DEFAULT_MINCONN = 2;

  protected static String DB_URL = "jdbc:{"+DB_DIALECT_KEY+"}://{"+DB_HOST_KEY+"}:{"+DB_PORT_KEY+"}/{"+DB_DATABASE_KEY+"}";

  static {
    String configPort = DBPropertyLoader.get(DB_PORT_KEY);
    String maxConnStr = DBPropertyLoader.get(DB_MAXCONN_KEY);
    String minConnStr = DBPropertyLoader.get(DB_MINCONN_KEY);
    if(configPort != null && !"".equals(configPort.trim())){
      DEFAULT_PORT = Integer.parseInt(configPort);
    }
    if(maxConnStr != null && !"".equals(maxConnStr.trim())){
      DEFAULT_MAXCONN = Integer.parseInt(maxConnStr);
    }
    if(minConnStr != null && !"".equals(minConnStr.trim())){
      DEFAULT_MINCONN = Integer.parseInt(minConnStr);
    }

    if(StringUtil.isNullOrBlank(DEFAULT_DRIVERCLASS)){
      DEFAULT_DRIVERCLASS = "com.mysql.jdbc.Driver";
    }
  }

  public static void initParamByOtherModule(String host, Integer port, String user, String pass, String dialect,
      String querystring, String driverClass, Integer maxConn, Integer minConn, String database ){
    logger.info("ddsdb模块里面的database参数被其他模块传入的信息重新初始化了！");
    if(!StringUtil.isNullOrBlank(host)){
      DEFAULT_HOST = host;
    }
    if(port != null){
      DEFAULT_PORT = port;
    }
    if(!StringUtil.isNullOrBlank(user)){
      DEFAULT_USER = user;
    }
    if(!StringUtil.isNullOrBlank(pass)){
      DEFAULT_PASS = pass;
    }
    if(!StringUtil.isNullOrBlank(dialect)){
      DEFAULT_DIALECT = dialect;
    }
    if(!StringUtil.isNullOrBlank(querystring)){
      DEFAULT_QUERYSTRING = querystring;
    }
    if(!StringUtil.isNullOrBlank(driverClass)){
      DEFAULT_DRIVERCLASS = driverClass;
    }
    if(!StringUtil.isNullOrBlank(database)){
      DEFAULT_DATABASE = database;
    }
    if(maxConn != null){
      DEFAULT_MAXCONN = maxConn;
    }
    if(minConn != null){
      DEFAULT_MINCONN = minConn;
    }
  }

}
