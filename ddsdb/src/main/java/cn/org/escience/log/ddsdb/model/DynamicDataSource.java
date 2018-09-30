package cn.org.escience.log.ddsdb.model;

import cn.org.escience.log.ddsdb.utils.DataSourceUtil;
import cn.org.escience.log.ddsdb.utils.FormatUtil;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class DynamicDataSource extends MysqlDataSource {

  //固定的或者读取的属性值
  private String host;
  private int port;
  private String user;
  private String pass;
  private String database;

  private String dialect;
  private String querystring;
  private String driverClass;

  private Integer maxConn;
  private Integer minConn;
  private String url;


  private Map<String, Object> parmas = new HashMap<>();

  public DynamicDataSource(String database){
    this(DataSourceConstant.DEFAULT_HOST, DataSourceConstant.DEFAULT_PORT,
        DataSourceConstant.DEFAULT_USER, DataSourceConstant.DEFAULT_PASS,
        database);

  }

  public DynamicDataSource(String host, Integer port, String user, String pass, String dialect, String querystring,
      String driverClass, Integer maxConn, Integer minConn, String database){
    this.host = host;
    this.port = port;
    this.user = user;
    this.pass = pass;
    this.database = database;

    this.dialect = dialect;
    this.querystring = querystring;
    this.driverClass = driverClass;

    this.maxConn = maxConn;
    this.minConn = minConn;

    //组装参数
    parmas.put(DataSourceConstant.DB_HOST_KEY,this.host);
    parmas.put(DataSourceConstant.DB_PORT_KEY,this.port);
    parmas.put(DataSourceConstant.DB_DIALECT_KEY,this.dialect);
    parmas.put(DataSourceConstant.DB_DATABASE_KEY,this.database);
    //url要保证到最后使用
    String url = FormatUtil.stringFormat(DataSourceConstant.DB_URL,parmas);
    if(querystring != null && !"".equals(querystring.trim())){
      this.url = url+"?"+querystring;
    }
  }

  public DynamicDataSource(String user, String pass){
    this(DataSourceConstant.DEFAULT_HOST, DataSourceConstant.DEFAULT_PORT, user, pass,
        DataSourceConstant.DEFAULT_DIALECT,
        DataSourceConstant.DEFAULT_QUERYSTRING,
        DataSourceConstant.DEFAULT_DRIVERCLASS,
        DataSourceConstant.DEFAULT_MAXCONN,
        DataSourceConstant.DEFAULT_MINCONN,
        DataSourceConstant.DEFAULT_DATABASE
    );
  }

  public DynamicDataSource(String host,int port,String user,String pass,String database){
    this(host, port, user, pass,
        DataSourceConstant.DEFAULT_DIALECT,
        DataSourceConstant.DEFAULT_QUERYSTRING,
        DataSourceConstant.DEFAULT_DRIVERCLASS,
        DataSourceConstant.DEFAULT_MAXCONN,
        DataSourceConstant.DEFAULT_MINCONN,
        database
        );


  }

  @Override
  public Connection getConnection() throws SQLException {
    return DataSourceUtil.doGetConnection(this);
  }

  @Override
  public Connection getConnection(String username, String password) throws SQLException {
    this.user = username;
    this.pass = password;
    return getConnection();
  }
}
