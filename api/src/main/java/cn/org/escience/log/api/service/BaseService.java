package cn.org.escience.log.api.service;

import cn.org.escience.log.api.config.AppConstant.Mybatis;
import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class BaseService {

  protected String database;//也就是传递的id
  protected SqlSession sqlSession;

  public BaseService(String database){
    this.database = database;
    buildConfAndGetSqlSession();
  }

  protected Environment getEnv(){
    DynamicDataSource ds = new DynamicDataSource(database);
    TransactionFactory tf = new JdbcTransactionFactory();
    Environment env = new Environment.Builder(ds.getDatabase())
        .dataSource(ds)
        .transactionFactory(tf)
        .build()
        ;
    return env;
  }

  protected void buildConfAndGetSqlSession(){
    //方法运行前
    Environment env = getEnv();
    Configuration conf = new Configuration(env);
    conf.setCacheEnabled(Mybatis.cacheEnabled);
    conf.setMapUnderscoreToCamelCase(Mybatis.mapUnderscoreToCamelCase);
    conf.setLazyLoadingEnabled(Mybatis.lazyLoadingEnable);
    conf.addMappers(Mybatis.mapperPackage);

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(conf);
    sqlSession = ssf.openSession(true);

    //方法运行后
//      sqlSession.commit();
//      releaseSession(sqlSession);
  }

  /**
   * 释放资源
   * @param sqlSession
   */
  public void releaseSession(SqlSession sqlSession){
      try {
        if(sqlSession != null){
          sqlSession.close();
        }
      }  catch (Exception e){
        e.printStackTrace();
      }
  }

  public SqlSession getSqlSession() {
    return sqlSession;
  }

  public String getDatabase() {
    return database;
  }
}
