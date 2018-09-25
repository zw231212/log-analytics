package cn.org.escience.log.api;

import cn.org.escience.log.api.mapper.BrowserMapper;
import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;

public class SqlSessionTest {

  @Test
  public void testGetSqlSessionFactory(){
    Environment env = getEnv();
    System.out.println(env.getDataSource());
    Configuration conf = new Configuration(env);
    SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(conf);
    System.out.println(sqf);
  }


  private Environment getEnv(){
    DynamicDataSource ds = new DynamicDataSource("test");
    TransactionFactory tf = new JdbcTransactionFactory();
    Environment env = new Environment.Builder(ds.getDatabase())
        .dataSource(ds)
        .transactionFactory(tf)
        .build()
        ;
    return env;
  }

  @Test
  public void testExecuteSql(){
    Environment env = getEnv();
    Configuration conf = new Configuration(env);
    conf.getMapperRegistry().addMapper(TestMapper.class);
    conf.getMapperRegistry().addMapper(BrowserMapper.class);

    SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(conf);

    SqlSession sqlSession = sqf.openSession();
    TestMapper mapper = sqlSession.getMapper(TestMapper.class);
    BrowserMapper bmapper = sqlSession.getMapper(BrowserMapper.class);
    long count = mapper.count();
    System.out.println(sqf);
    sqlSession.commit();
    System.out.println("=======================================================");
    System.out.println(count);
    Browser browser = bmapper.selectByPrimaryKey(2);
    System.out.println(browser);
    sqlSession.close();
  }


  @Test
  public void testGetConf() throws SQLException {
    Environment env = getEnv();
    System.out.println(env.getId());
    DataSource ds = env.getDataSource();
    System.out.println(ds);
    System.out.println("=-=================直接查询 start=================================");
    Connection connection = ds.getConnection();
    PreparedStatement ps = connection
        .prepareStatement("SELECT count(*) from  browser");
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
      System.out.println(rs.getMetaData());
      System.out.println(rs.getInt(1));
    }
    System.out.println(connection);
    System.out.println("====================直接查询 end, mybatis 操作 started=================================");

    InputStream resourceAsStream = SqlSessionTest.class.getResourceAsStream("/mybatis-conf.xml");
    SqlSessionFactory sq = new SqlSessionFactoryBuilder()
        .build(resourceAsStream,env.getId());
    System.out.println(sq);
    
    if(sq == null){
      return;
    }
    MapperRegistry mp = sq.getConfiguration().getMapperRegistry();
    System.out.println(mp.getMappers());

//    SqlSession sqlSession = sq.openSession(connection); .//因为上面的方式并没有将数据源注入进去，写入id但是mybatis的环境里面没有
    //这个datasource，所以必须得使用java的方式
    SqlSession sqlSession = sq.openSession();
    System.out.println(sqlSession);
    BrowserMapper mapper = sqlSession.getMapper(BrowserMapper.class);
    Browser browser = mapper.selectByPrimaryKey(2);
    System.out.println(browser.getHits());
    System.out.println(browser.getName());
    ps.close();
    connection.close();
  }

  @Test
  public void testJavaConf(){
    Environment env = getEnv();
    Configuration conf = new Configuration(env);
    conf.setCacheEnabled(true);
    conf.setMapUnderscoreToCamelCase(true);
    conf.setLazyLoadingEnabled(true);
    conf.addMappers("cn.org.escience.log.api.mapper");

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(conf);
    SqlSession sqlSession = ssf.openSession();
    BrowserMapper bmapper = sqlSession.getMapper(BrowserMapper.class);
    Browser browser = bmapper.selectByPrimaryKey(3);
    sqlSession.commit();
    System.out.println(browser.getName());
    System.out.println(browser.getHits());
    System.out.println(browser.getYearMonth());
    sqlSession.close();
  }


}
