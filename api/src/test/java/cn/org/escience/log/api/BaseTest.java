package cn.org.escience.log.api;

import java.net.URI;
import java.util.Enumeration;
import java.util.Properties;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;
import org.junit.Test;

public class BaseTest {

  @Test
  public void test1(){
    URI uri = UriBuilder.fromUri("127.0.0.1").port(8080).build();
    URI jerseyUri = new JerseyUriBuilder().port(8080).build();
    System.out.println(uri);
    System.out.println(jerseyUri);
  }

  @Test
  public void test2(){
    Properties properties = System.getProperties();
    Enumeration<?> names = properties.propertyNames();
    while (names.hasMoreElements()){
      Object o = names.nextElement();
      System.out.println(o+">>>"+properties.get(o));
    }
  }

}
