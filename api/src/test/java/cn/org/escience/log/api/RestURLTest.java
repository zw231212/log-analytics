package cn.org.escience.log.api;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import org.junit.Test;

public class RestURLTest {

  @Test
  public void test() {
    Builder builder = ClientBuilder.newClient()
        .target("http://localhost:8081/").path("browser")
        .request(MediaType.TEXT_PLAIN);
    builder = builder.property("id", "12312312");
    String responseText = builder.get(String.class);
    System.out.println(responseText);
  }

}
