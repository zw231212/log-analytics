package cn.org.escience.log.ddsdb.utils;

import cn.org.escience.log.ddsdb.connection.ConnectionHolder;
import cn.org.escience.log.ddsdb.model.DynamicDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据源操作相关的类，不实际存储相关的数据，相关的存储数据在ConnectionHolder里面
 */
public class DataSourceUtil {

  private static final Logger logger = LoggerFactory.getLogger(DataSourceUtil.class);

  private static ConnectionHolder connHolder = ConnectionHolder.getInstance();

  /**
   * 连接管理，datasource管理
   */
  public static Connection doGetConnection(DynamicDataSource dds) throws SQLException {
    if(dds == null){
      return null;
    }
    return connHolder.getConnection(dds);
  }

  public static boolean doReleaseConnection(Connection con, DataSource dataSource) throws SQLException {
    if (con == null) {
      return false;
    }
    DynamicDataSource dds = null;
    if(dataSource instanceof DynamicDataSource){
      dds = (DynamicDataSource) dataSource;
    }

    if(dds == null){
      logger.warn("不是动态数据源的实例!");
      return false;
    }
    logger.debug("Returning JDBC Connection to DataSource");
    return connHolder.doCloseConnectionIfNecessary(con, dds);

  }

}
