package cn.org.escience.log.api;


import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.web.conf.JerseyConfig;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.net.InetAddress;
import java.net.URI;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.jetty.JettyHttpContainer;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ApplicationHandler;
import org.glassfish.jersey.server.ContainerRequest;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 开启服务，加载基础数据
 */
public class LogAPIApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogAPIApplication.class);

  public static void main(String[] args) throws Exception {
    // 获取资源文件目录
    String resourcePath = LogAPIApplication.class.getClass()
        .getResource("/").getPath();
    resourcePath = resourcePath.substring(0,resourcePath.length()-1);
    int lastIndex = resourcePath.lastIndexOf("/");
    resourcePath = resourcePath.substring(0,lastIndex)+"/resources";

    long begin = System.currentTimeMillis();
    //获取配置文件信息,在config里面的AppConstant
    //检查配置文件信息

    //配置server信息并加载server

    String contextPath = "/";
    if(!StringUtil.isNullOrBlank(AppConstant.Server.contextPath)){
      contextPath = AppConstant.Server.contextPath;
    }

    Server server =new Server(AppConstant.Server.port);

    //设置context path
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
    context.setContextPath(contextPath);

    server.setHandler(context);

    ServletHolder servlet = context.addServlet(ServletContainer.class,"/v1/*");
    servlet.setInitOrder(1);
    servlet.setInitParameter("jersey.config.server.provider.packages",
        AppConstant.Server.basePackage);
    servlet.setInitParameter("javax.ws.rs.Application",
        "cn.org.escience.log.api.web.conf.JerseyConfig");

    //设置资源文件路径
    HandlerWrapper wrapper = new HandlerWrapper();
    context.insertHandler(wrapper);

    ResourceHandler resourceHandler = new ResourceHandler();
    resourceHandler.setDirectoriesListed(false);
    resourceHandler.setWelcomeFiles(new String[]{"index.html"});
    resourceHandler.setResourceBase(resourcePath);

    HandlerList handlerList = new HandlerList();
    handlerList.setHandlers(new Handler[]{resourceHandler, new DefaultHandler()});
    wrapper.setHandler(handlerList);

        //JettyHttpContainerFactory.createServer(baseUri, jerseyConfig, false);
    server.setHandler(context);

    String uri = server.getURI().toString();

    System.out.println(uri);

    System.out.println(server);
    try {
      server.start();
      server.join();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      server.destroy();
    }
    long end = System.currentTimeMillis();
    logger.info("server started at {},用时：{} ms ", uri, (end - begin));

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
