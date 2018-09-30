package cn.org.escience.log.api;


import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 开启服务，加载基础数据，测试的启动类
 */
public class LogAPIApplication2 {

  private static final Logger logger = LoggerFactory.getLogger(LogAPIApplication2.class);

  public static void main(String[] args) throws Exception {
    Server server = new Server(8089);

//    ServletContextHandler ctx =
//        new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

//    ctx.setContextPath("/api");
//    server.setHandler(ctx);

    ServletHolder serHol = new ServletHolder(ServletContainer.class);
    serHol.setInitOrder(1);
//    serHol.setInitParameter("jersey.config.server.provider.packages",
//        "cn.org.escience.log.api");
    serHol.setInitParameter("javax.ws.rs.Application",
    "cn.org.escience.log.api.web.conf.JerseyConfig");

    WebAppContext webAppContext = new WebAppContext();
    webAppContext.setContextPath("/api123");
    webAppContext.setResourceBase("api/src/main/webapp");
//    webAppContext.setOverrideDescriptor("api/src/main/webapp/WEB-INF/web.xml");
//    webAppContext.setServletHandler(serHol.getServletHandler());
//    webAppContext.addServlet(serHol,"/v1/*");

    HandlerList handlerList = new HandlerList();
    handlerList.setHandlers(new Handler[]{
        webAppContext, new DefaultHandler()
//        ctx
    });

    server.setHandler(handlerList);
    server.start();
    server.join();
  }

  /**
   * 开始的时候进行的一些测试
   */
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
