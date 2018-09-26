package cn.org.escience.log.api.web.entity;

import cn.org.escience.log.api.config.AppConstant.Server;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 首页展示的描述性信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@XmlRootElement
public class IndexInfo implements Serializable {
  private String host = Server.uri;
  private int port = Server.port;
  private String name = Server.name;
  private String descr = Server.descr;
  private String version = Server.version;
  private String contextPath = Server.contextPath;
}

