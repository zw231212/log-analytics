package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.FiletypesMapper;
import cn.org.escience.log.api.model.Filetypes;
import cn.org.escience.log.api.model.FiletypesExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.FileTypesService;
import cn.org.escience.log.api.utils.ServiceUtil;
import java.util.List;

public class FileTypesServiceImpl extends BaseService implements FileTypesService {

  private FiletypesMapper filetypesMapper = sqlSession.getMapper(FiletypesMapper.class);

  public FileTypesServiceImpl(String database) {
    super(database);
  }

  @Override
  public List<Filetypes> findAll(List<String> dates) {
    dates = ServiceUtil.checkDates(dates);
    FiletypesExample filetypesExample = new FiletypesExample();
    filetypesExample.setOrderByClause("hits DESC");
    List<Filetypes> filetypes = filetypesMapper.selectByExample(filetypesExample);
    return filetypes;
  }
}
