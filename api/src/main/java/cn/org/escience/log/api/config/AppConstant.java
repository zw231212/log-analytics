package cn.org.escience.log.api.config;

import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.util.Arrays;
import java.util.List;

public class AppConstant {

  /**
   * 配置文件里的参数
   */
  public static final String  MODULE_NAME_KEY =  "module.name";
  public static final String  MODULE_RESOURCE_KEY =  "module.resources";
  public static final String  SERVER_URI_KEY =  "server.uri";
  public static final String  SERVER_PORT_KEY =  "server.port";
  public static final String  SERVER_BASE_PACKAGE_KEY =   "server.basePackage";
  public static final String  SERVER_NAME_KEY =       "server.name";
  public static final String  SERVER_DESCR_KEY =    "server.descr";
  public static final String  SERVER_VERSION_KEY =      "server.version";
  public static final String  SERVER_DB_SUFFIX_KEY =      "server.dbSuffix";
  public static final String  SERVER_CONTEXT_PATH_KEY =      "server.contextPath";
  public static final String  MYBATIS_CAMELCASE_KEY =  "mybatis.mapUnderscoreToCamelCase";
  public static final String  MYBATIS_ENABLE_CACHE_KEY =  "mybatis.cacheEnabled";
  public static final String  MYBATIS_MAPPER_PACKAGE_KEY =  "mybatis.mapperPackage";
  public static final String  MYBATIS_LAZYLOADING_KEY =  "mybatis.lazyLoadingEnable";
  public static final String  CROS_ALLOW_ORIGIN_KEY =  "cors.allowOrigin";
  public static final String  CROS_ALLOW_HEADERS_KEY =  "cors.allowHeaders";
  public static final String  CROS_ALLOW_CREDENTIALS_KEY =  "cors.allowCredentials";
  public static final String  CROS_ALLOW_METHODS_KEY =  "cors.allowMethods";
  public static final String  CROS_MAXAGE_KEY =  "cors.maxAge";
  public static final String  DDSDB_HOST_KEY =  "ddsdb.host";
  public static final String  DDSDB_PORT_KEY =  "ddsdb.port";
  public static final String  DDSDB_USER_KEY =  "ddsdb.user";
  public static final String  DDSDB_PASS_KEY =  "ddsdb.pass";
  public static final String  DDSDB_DEFAULT_DATABASE_KEY =  "ddsdb.defaultDatabase";
  public static final String  DDSDB_DIALECT_KEY =  "ddsdb.dialect";
  public static final String  DDSDB_QUERYSTRING_KEY =  "ddsdb.querystring";
  public static final String  DDSDB_DRIVERCLASS_KEY =  "ddsdb.driverClass";
  public static final String  DDSDB_MAXCONN_KEY =  "ddsdb.maxConn";
  public static final String  DDSDB_MINCONN_KEY =  "ddsdb.minConn";

  public static List<String> queryTypes = Arrays.asList("month", "day" , "year");
  public static List<Integer> errorCodes = Arrays.asList(400, 403 , 404);
  public static List<String> pagesActions = Arrays.asList("all", "entry" , "exit");
  public static List<String> orders = Arrays.asList("hits DESC", "hits ASC" , "pages DESC", "pages ASC",
      "lastvisit DESC", "lastvisit ASC", "bandwidth DESC", "bandwidth ASC", "downloads DESC", "downloads ASC");

  /**
   * 模块相关的参数信息配置
   */
  public static class Module{
    public static String name = AppConfiguration.get(MODULE_NAME_KEY);
    public static String resources = AppConfiguration.get(MODULE_RESOURCE_KEY);
  }



  /**
   * 服务器配置相关的信息
   */
   public static class Server{

     public static String name = AppConfiguration.get(SERVER_NAME_KEY);
     public static String descr = AppConfiguration.get(SERVER_DESCR_KEY);
     public static String version = AppConfiguration.get(SERVER_VERSION_KEY);

     public static String uri = AppConfiguration.get(SERVER_URI_KEY);
     public static int port = 8080;
     public static String  basePackage = AppConfiguration.get(SERVER_BASE_PACKAGE_KEY);
     public static String  dbSuffix = AppConfiguration.get(SERVER_DB_SUFFIX_KEY);
     public static String  contextPath = AppConfiguration.get(SERVER_CONTEXT_PATH_KEY);
     static {
          String portStr =  AppConfiguration.get(SERVER_PORT_KEY);
          if(!StringUtil.isNullOrBlank(portStr)){
            port = Integer.parseInt(portStr);
          }
     }
   }

  /**
   * mybatis配置相关的信息
   */
   public static class Mybatis{
     public static Boolean mapUnderscoreToCamelCase;
     public static Boolean cacheEnabled;
     public static Boolean lazyLoadingEnable;
     public static String mapperPackage = AppConfiguration.get(MYBATIS_MAPPER_PACKAGE_KEY);

     static {
       String s1 = AppConfiguration.get(MYBATIS_CAMELCASE_KEY);
       String s2 = AppConfiguration.get(MYBATIS_ENABLE_CACHE_KEY);
       String s3 = AppConfiguration.get(MYBATIS_LAZYLOADING_KEY);
       if(!StringUtil.isNullOrBlank(s1)){
          mapUnderscoreToCamelCase = Boolean.parseBoolean(s1);
       }
       if(!StringUtil.isNullOrBlank(s2)){
          cacheEnabled = Boolean.parseBoolean(s2);
       }
       if(!StringUtil.isNullOrBlank(s3)){
         lazyLoadingEnable = Boolean.parseBoolean(s3);
       }
     }
   }

  /**
   * 跨域相关的配置
   */
  public static class Cros{
     public static String maxAge  = AppConfiguration.get(CROS_MAXAGE_KEY);
     public static String allowMethods  = AppConfiguration.get(CROS_ALLOW_METHODS_KEY);
     public static String allowOrigin  = AppConfiguration.get(CROS_ALLOW_ORIGIN_KEY);
     public static String allowHeaders  = AppConfiguration.get(CROS_ALLOW_HEADERS_KEY);
     public static String allowCredentials  = AppConfiguration.get(CROS_ALLOW_CREDENTIALS_KEY);
   }

   public static class DdsdbConf{
    public static String host = AppConfiguration.get(DDSDB_HOST_KEY);
     public static Integer port= 3306;
     public static String user= AppConfiguration.get(DDSDB_USER_KEY);
     public static String pass= AppConfiguration.get(DDSDB_PASS_KEY);
     public static String defaultDatabase = AppConfiguration.get(DDSDB_DEFAULT_DATABASE_KEY);
     public static String dialect = AppConfiguration.get(DDSDB_DIALECT_KEY);
     public static String querystring = AppConfiguration.get(DDSDB_QUERYSTRING_KEY);
     public static String driverClass = AppConfiguration.get(DDSDB_DRIVERCLASS_KEY);
     public static Integer maxConn= 10;
     public static Integer minConn= 1;

     static {
       String s = AppConfiguration.get(DDSDB_PORT_KEY);
       String s1 = AppConfiguration.get(DDSDB_MAXCONN_KEY);
       String s2 = AppConfiguration.get(DDSDB_MINCONN_KEY);
       if(!StringUtil.isNullOrBlank(s)){
         port = Integer.parseInt(s);
       }
       if(!StringUtil.isNullOrBlank(s1)){
         maxConn = Integer.parseInt(s1);
       }
       if(!StringUtil.isNullOrBlank(s2)){
         minConn = Integer.parseInt(s2);
       }
     }
   }

}
