package cn.org.escience.log.api;


import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.web.conf.JerseyConfig;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 开启服务，加载基础数据
 */
public class LogAPIApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogAPIApplication.class);

  public static void main(String[] args) throws Exception {
    //获取配置文件信息,在config里面的AppConstant
    //检查配置文件信息

    //配置server信息并加载server
    URI baseUri = UriBuilder
        .fromUri(AppConstant.Server.uri)
        .port(AppConstant.Server.port)
        .build();
    JerseyConfig jerseyConfig = new JerseyConfig(AppConstant.Server.basePackage);


    Server server = JettyHttpContainerFactory.createServer(baseUri, jerseyConfig);
    server.start();

    logger.info("server started at {}:{} ",baseUri.getHost(),baseUri.getPort());

//    someTest();
  }

  public static void someTest(){
    System.out.println("启动服务后标准输出测试！");
    //jetty启动服务
//    Server server = new Server(8989);
//    server.setHandler(new BrowserController());
//    server.start();
//    server.join();

//    URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
//    Server server = JettyHttpContainerFactory.createServer(baseUri, new JerseyConfig());
//    server.start();

    //
    // 若使用 Jdk Http Server请去掉下面的注释
    // JdkHttpServerFactory.createHttpServer(URI.create(BASE_URI), new
    // RestApplication());

    // 若使用 Grizzly Http Server请去掉下面的注释
    // GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), new
    // RestApplication());

    // 若使用 Simple Http Server请去掉下面的注释
    // SimpleContainerFactory.create(URI.create(BASE_URI), new
    // RestApplication());

  }

}
