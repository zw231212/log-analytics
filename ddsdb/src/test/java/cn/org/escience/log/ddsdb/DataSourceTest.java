package cn.org.escience.log.ddsdb;

import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;

public class DataSourceTest {

  @Test
  public void testDDS() throws SQLException {
    DynamicDataSource dds = new DynamicDataSource("test");
    System.out.println(dds.getUrl());
    Connection connection = dds.getConnection();
    System.out.println(connection);
    System.out.println("===================================");
    DynamicDataSource dds2 = new DynamicDataSource("vue-mall");
    System.out.println(dds2.getUrl());
    Connection connection1 = dds2.getConnection();
    System.out.println(connection1);
  }

}
