package cn.org.escience.log.api.config;

import cn.org.escience.log.ddsdb.utils.StringUtil;

public class AppConstant {

  public static final String  SERVER_URI_KEY =  "server.uri";
  public static final String  SERVER_PORT_KEY =  "server.port";
  public static final String  SERVER_BASE_PACKAGE_KEY =   "server.basePackage";
  public static final String  SERVER_NAME_KEY =       "server.name";
  public static final String  SERVER_DESCR_KEY =    "server.descr";
  public static final String  SERVER_VERSION_KEY =      "server.version";
  public static final String  MYBATIS_CAMELCASE_KEY =  "mybatis.mapUnderscoreToCamelCase";
  public static final String  MYBATIS_ENABLE_CACHE_KEY =  "mybatic.cacheEnabled";
  public static final String  MYBATIS_MAPPER_PACKAGE_KEY =  "mybati.mapperPackage";
  public static final String  MYBATIS_LAZYLOADING_KEY =  "mybatis.lazyLoadingEnable";
  public static final String  CROS_ALLOW_ORIGIN_KEY =  "cors.allowOrigin";
  public static final String  CROS_ALLOW_HEADERS_KEY =  "cors.allowHeaders";
  public static final String  CROS_ALLOW_CREDENTIALS_KEY =  "cors.allowCredentials";
  public static final String  CROS_ALLOW_METHODS_KEY =  "cors.allowMethods";
  public static final String  CROS_MAXAGE_KEY =  "cors.maxAge";




  /**
   * 服务器配置相关的信息
   */
   public static class Server{

     public static String name = ApplicationConfiguration.get(SERVER_NAME_KEY);
     public static String descr = ApplicationConfiguration.get(SERVER_DESCR_KEY);
     public static String version = ApplicationConfiguration.get(SERVER_VERSION_KEY);

     public static String uri = ApplicationConfiguration.get(SERVER_URI_KEY);
     public static int port = 8080;
     public static String  basePackage = ApplicationConfiguration.get(SERVER_BASE_PACKAGE_KEY);
     static {
          String portStr =  ApplicationConfiguration.get(SERVER_PORT_KEY);
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
     public static String mapperPackage = ApplicationConfiguration.get(MYBATIS_MAPPER_PACKAGE_KEY);

     static {
       String s1 = ApplicationConfiguration.get(MYBATIS_CAMELCASE_KEY);
       String s2 = ApplicationConfiguration.get(MYBATIS_ENABLE_CACHE_KEY);
       String s3 = ApplicationConfiguration.get(MYBATIS_LAZYLOADING_KEY);
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

   public static class Cros{
     public static String maxAge  = ApplicationConfiguration.get(CROS_MAXAGE_KEY);
     public static String allowMethods  = ApplicationConfiguration.get(CROS_ALLOW_METHODS_KEY);
     public static String allowOrigin  = ApplicationConfiguration.get(CROS_ALLOW_ORIGIN_KEY);
     public static String allowHeaders  = ApplicationConfiguration.get(CROS_ALLOW_HEADERS_KEY);
     public static String allowCredentials  = ApplicationConfiguration.get(CROS_ALLOW_CREDENTIALS_KEY);
   }


}
