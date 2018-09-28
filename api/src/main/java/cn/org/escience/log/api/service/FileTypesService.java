package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Filetypes;
import java.util.List;

public interface FileTypesService {

  List<Filetypes> findAll(List<String> dates);

}
