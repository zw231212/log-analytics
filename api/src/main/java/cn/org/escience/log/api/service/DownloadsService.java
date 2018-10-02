package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Downloads;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface DownloadsService {

  PageInfo<Downloads> findAll(List<String> dates, int number, int size, String type, String order);

}
