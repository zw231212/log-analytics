package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.Errors404Mapper;
import cn.org.escience.log.api.mapper.ErrorsMapper;
import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.model.Errors404;
import cn.org.escience.log.api.model.Errors404Example;
import cn.org.escience.log.api.model.ErrorsExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.ErrorService;
import cn.org.escience.log.api.utils.ServiceUtil;
import cn.org.escience.log.api.web.entity.vo.ErrorDetailVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class ErrorServiceImpl extends BaseService implements ErrorService {

  private ErrorsMapper errorsMapper = sqlSession.getMapper(ErrorsMapper.class);
  private Errors404Mapper errors404Mapper = sqlSession.getMapper(Errors404Mapper.class);

  public ErrorServiceImpl(String database) {
    super(database);
  }

  @Override
  public List<Errors> findAll(List<String> dates) {
    dates = ServiceUtil.checkDates(dates);
    ErrorsExample errorsExample = new ErrorsExample();
    errorsExample.createCriteria().andYearMonthIn(dates);
    errorsExample.setOrderByClause("hits DESC");
    List<Errors> errors = errorsMapper.selectByExample(errorsExample);
    return errors;
  }

  @Override
  public ErrorDetailVo findDetailErrorPage(List<String> dates, int number, int size, int code) {
    dates = ServiceUtil.checkDates(dates);

    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    ErrorDetailVo edvo = new ErrorDetailVo();
    edvo.setCode(code);
    PageHelper.startPage(number, size);
    switch (code){
      case 404:
        Errors404Example errors404Example = new Errors404Example();
        errors404Example.createCriteria().andYearMonthIn(dates);
        errors404Example.setOrderByClause("hits DESC");
        List<Errors404> errors404s = errors404Mapper.selectByExample(errors404Example);
        PageInfo<Errors404> pageInfo = new PageInfo<>(errors404s);
        edvo.setPage(pageInfo);
        break;
      case 403:
        break;
      case 400:
        break;
    }

    return edvo;
  }
}
