package cn.org.escience.log.api;


import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.web.conf.JerseyConfig;
import java.net.URI;
import java.util.Set;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 开启服务，加载基础数据
 */
public class LogAPIApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogAPIApplication.class);

  public static void main(String[] args) throws Exception {
    //获取配置文件信息

    //检查配置文件信息

    //配置server信息并加载server
    URI baseUri = UriBuilder
        .fromUri(AppConstant.Server.uri)
        .port(AppConstant.Server.port)
        .build();
    JerseyConfig jerseyConfig = new JerseyConfig(AppConstant.Server.basePackage);


    Server server = JettyHttpContainerFactory.createServer(baseUri, jerseyConfig);
    server.start();

    Set<Resource> resources = jerseyConfig.getResources();
    System.out.println("================jersey resources================================");
    for (Resource resource : resources) {
      System.out.println(resource);
    }
    System.out.println("================server resources========================================");
    Set<Resource> resources1 = jerseyConfig.getConfiguration().getResources();
    for (Resource resource : resources1) {
      System.out.println(resource);
    }
    System.out.println("================================================");
    logger.info("server started at {}:{} ",baseUri.getHost(),baseUri.getPort());

    someTest();
  }

  public static void someTest(){
    System.out.println("标准测试输出！");
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
