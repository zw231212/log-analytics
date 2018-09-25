package cn.org.escience.log.api.web.conf;

import cn.org.escience.log.api.web.interceptor.ServiceInterceptor;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {

  /**
   * Instantiates a new jersey config.
   */
  public JerseyConfig(String basePackage) {
    packages(basePackage);
    //Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
    // 配置json转换。配置后如果api定义返回类型为json、且pojo注解XmlRootElement，将自动转为json返回；否则需要自己转换,
    register(JacksonJsonProvider.class);
    register(MultiPartFeature.class);
    createClient();
    ////注册过滤器

    ///注册拦截器
//    register(ServiceInterceptor.class);
//    register(GzipInterceptor.class); //或者增加@Provider注解也可以注册
  }

  private static Client createClient(){
    ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(ServiceInterceptor.class);
    return ClientBuilder.newClient(clientConfig);
  }
}
