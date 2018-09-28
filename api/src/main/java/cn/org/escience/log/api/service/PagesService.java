package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Pages;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface PagesService {

  PageInfo<Pages> findAll(List<String> dates, int number, int size, String action);

}
