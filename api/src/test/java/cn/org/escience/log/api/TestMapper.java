package cn.org.escience.log.api;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {

  @Select("SELECT COUNT(ID) FROM USER")
  long count();

}
