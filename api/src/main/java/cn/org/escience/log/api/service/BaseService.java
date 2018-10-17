package cn.org.escience.log.api.service;

import cn.org.escience.log.api.config.AppConstant.DdsdbConf;
import cn.org.escience.log.api.config.AppConstant.Mybatis;
import cn.org.escience.log.api.config.AppConfiguration;
import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

/**
 * 每个service都必须继承的基础服务类
 */
public class BaseService {

  private static TransactionFactory tf = new JdbcTransactionFactory();

  protected String database;//也就是传递的id
  protected SqlSession sqlSession;
  protected SqlSessionFactory ssf;
  protected DynamicDataSource ds;
  protected Configuration conf;
  protected Environment env;
  private static ServiceManager sm = ServiceManager.getInstance();

  public BaseService(String database){
    this(DdsdbConf.host,DdsdbConf.port,DdsdbConf.user, DdsdbConf.pass, database);
  }

  private BaseService(String host, Integer port, String user, String pass, String database){
      this.database = database;
      ds = new DynamicDataSource(host, port, user, pass, database);
      buildConfAndGetSqlSession();
  }

  protected void buildEnv(){
    env = new Environment.Builder(ds.getDatabase())
        .dataSource(ds)
        .transactionFactory(tf)
        .build()
        ;
  }

  protected void buildConfAndGetSqlSession(){
    //方法运行前
    buildEnv();
    conf = new Configuration(env);
    conf.setCacheEnabled(Mybatis.cacheEnabled);
    conf.setMapUnderscoreToCamelCase(Mybatis.mapUnderscoreToCamelCase);
    conf.setLazyLoadingEnabled(Mybatis.lazyLoadingEnable);
    conf.addMappers(Mybatis.mapperPackage);

    //加入分页插件
    PageInterceptor pageInterceptor = new PageInterceptor();
    pageInterceptor.setProperties(AppConfiguration.pagehelperProps);

    conf.addInterceptor(pageInterceptor);

    ssf = new SqlSessionFactoryBuilder().build(conf);
    sqlSession = ssf.openSession(true);
    sm.addRelaseSession(sqlSession);


    //方法运行后
//      sqlSession.commit();
//      releaseSession(sqlSession);
  }



  public SqlSession getSqlSession() {
    return sqlSession;
  }

  public String getDatabase() {
    return database;
  }
}
