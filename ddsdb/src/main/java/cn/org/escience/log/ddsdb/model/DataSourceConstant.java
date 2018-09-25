package cn.org.escience.log.ddsdb.model;

import cn.org.escience.log.ddsdb.config.DBPropertyLoader;

public class DataSourceConstant {
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

  //默认固定值配置读取
  protected static String DEFAULT_HOST = DBPropertyLoader.get(DB_HOST_KEY);
  protected static Integer DEFAULT_PORT = 3306;
  protected static String DEFAULT_USER = DBPropertyLoader.get(DB_USER_KEY);
  protected static String DEFAULT_PASS = DBPropertyLoader.get(DB_PASS_KEY);
  protected static String DEFAULT_DIALECT = DBPropertyLoader.get(DB_DIALECT_KEY);
  protected static String DEFAULT_QUERYSTRING = DBPropertyLoader.get(DB_QUERYSTRING_KEY);
  protected static String DEFAULT_DRIVERCLASS = DBPropertyLoader.get(DB_DRIVER_CLASS_KEY);
  protected static Integer DEFAULT_MAXCONN = 10;
  protected static Integer DEFAULT_MINCONN = 2;

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

  }
}
