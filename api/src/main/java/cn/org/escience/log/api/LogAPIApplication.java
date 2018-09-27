package cn.org.escience.log.api;


import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.config.AppConstant.Module;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * main方法开启jetty服务，加载基础数据
 */
public class LogAPIApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogAPIApplication.class);

  public static void main(String[] args) throws Exception {

    long begin = System.currentTimeMillis();
    //获取配置文件信息,在config里面的AppConstant
    //检查配置文件信息

    //配置server信息并加载server

    String contextPath = "/";
    if(!StringUtil.isNullOrBlank(AppConstant.Server.contextPath)){
      contextPath = AppConstant.Server.contextPath;
    }

    Server server =new Server(AppConstant.Server.port);
    ServletHolder serHol = new ServletHolder(ServletContainer.class);
    serHol.setInitOrder(1);
    serHol.setInitParameter("javax.ws.rs.Application", "cn.org.escience.log.api.web.conf.JerseyConfig");

    WebAppContext webAppContext = new WebAppContext();
    webAppContext.setContextPath(contextPath);
    String resourceBase = Module.name+"/"+Module.resources;
    webAppContext.setResourceBase(resourceBase);

    HandlerList handlerList = new HandlerList();
    handlerList.setHandlers(new Handler[]{
        webAppContext,
        new DefaultHandler()}
        );


    server.setHandler(handlerList);

    /**
     * 如果根据server.getURI获取的port是-1，所以才有下面这些操作
     */
    //获取server运行的实际的端口，其实和指定的一样，但是这里是根据这样的来直接获取
    ServerConnector connector = (ServerConnector) server.getConnectors()[0];
    int port = connector.getPort();

    //根据获取的端口来构建一个服务初始的url
    URI uri = server.getURI();
    uri = UriBuilder.fromUri(uri).port(port).build();

    try {
      server.start();
      long end = System.currentTimeMillis();
      logger.info("server started at {},用时：{} ms ", uri.toURL().toString(), (end - begin));
      server.join();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      server.destroy();
    }
  }

  private static String getModuleName(){
    String userDir = System.getProperty("user.dir");
    int lastIndex = userDir.lastIndexOf("/");
    return userDir.substring(lastIndex+1);
  }

  private static String getUserDir(){
    return System.getProperty("user.dir");
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

    /**
     * //设置context path
     *     ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
     *     context.setContextPath(contextPath);
     *
     *     server.setHandler(context);
     *
     *     ServletHolder servlet = context.addServlet(ServletContainer.class,"/v1/*");
     *     servlet.setInitOrder(1);
     *     servlet.setInitParameter("jersey.config.server.provider.packages",
     *         AppConstant.Server.basePackage);
     *     servlet.setInitParameter("javax.ws.rs.Application",
     *         "cn.org.escience.log.api.web.conf.JerseyConfig");
     *
     *     //设置资源文件路径
     *     HandlerWrapper wrapper = new HandlerWrapper();
     *     context.insertHandler(wrapper);
     *
     *     ResourceHandler resourceHandler = new ResourceHandler();
     *     resourceHandler.setDirectoriesListed(false);
     *     resourceHandler.setWelcomeFiles(new String[]{"index.html"});
     *     resourceHandler.setResourceBase(resourcePath);
     *
     *     //JettyHttpContainerFactory.createServer(baseUri, jerseyConfig, false);
     *
     */
  }

}
