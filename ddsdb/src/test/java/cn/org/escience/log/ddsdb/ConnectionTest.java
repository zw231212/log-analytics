package cn.org.escience.log.ddsdb;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import org.junit.Test;

public class ConnectionTest {

  @Test
  public void testMySqlCollection(){
    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    String name = "root";
    String pass = "tiger";
    String sql = "SELECT * FROM user";
    String sql2 = "SELECT * FROM user WHERE id = ?";
    Connection conn = getConnection(url, name, pass);
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()){
        ResultSetMetaData metaData = rs.getMetaData();
        System.out.println(metaData);
      }
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(conn != null){
          conn.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      if(ps != null){
        try {
          ps.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }


  }

  private Connection getConnection(String url, String name, String pass){
    try{
      //自动会注册，高版本的会
//      Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
//      Driver driver = (Driver) aClass.newInstance();
//      System.out.println(driver);
//      DriverManager.registerDriver(driver);
      Connection connection = DriverManager.getConnection(url, name, pass);
      return connection;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Test
  public void testRandom(){
    int i=0;
    while(i<40){
      int j = new Random().nextInt(10);
      System.out.println(j);
      i++;
    }

  }

}
