package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.Errors400Mapper;
import cn.org.escience.log.api.mapper.Errors403Mapper;
import cn.org.escience.log.api.mapper.Errors404Mapper;
import cn.org.escience.log.api.mapper.ErrorsMapper;
import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.model.Errors400;
import cn.org.escience.log.api.model.Errors400Example;
import cn.org.escience.log.api.model.Errors403;
import cn.org.escience.log.api.model.Errors403Example;
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
  private Errors400Mapper errors400Mapper = sqlSession.getMapper(Errors400Mapper.class);
  private Errors403Mapper errors403Mapper = sqlSession.getMapper(Errors403Mapper.class);

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
        Errors403Example errors403Example = new Errors403Example();
        errors403Example.createCriteria().andYearMonthIn(dates);
        errors403Example.setOrderByClause("hits DESC");
        List<Errors403> errors403s = errors403Mapper.selectByExample(errors403Example);
        PageInfo<Errors403> e403page = new PageInfo<>(errors403s);
        edvo.setPage(e403page);
        break;
      case 400:
        Errors400Example errors400Example = new Errors400Example();
        errors400Example.createCriteria().andYearMonthIn(dates);
        errors400Example.setOrderByClause("hits DESC");
        List<Errors400> errors400s = errors400Mapper.selectByExample(errors400Example);
        PageInfo<Errors400> e400page = new PageInfo<>(errors400s);
        edvo.setPage(e400page);
        break;
    }

    return edvo;
  }
}
