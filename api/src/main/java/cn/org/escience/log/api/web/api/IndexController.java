package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.web.entity.IndexInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexController {

  private static final IndexInfo ii = new IndexInfo();

  @GET
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public IndexInfo indexGet(){
    System.out.println(ii);
    return ii;
  }

  @POST
  public IndexInfo indexPost(){
    System.out.println(ii);
    return ii;
  }


}
