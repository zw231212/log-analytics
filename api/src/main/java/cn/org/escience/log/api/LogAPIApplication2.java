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
 * 开启服务，加载基础数据
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

}
