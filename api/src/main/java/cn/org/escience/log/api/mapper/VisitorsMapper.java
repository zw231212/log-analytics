/*
*
* VisitorsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Visitors;
import cn.org.escience.log.api.model.VisitorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Visitors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Visitors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Visitors> selectByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Visitors selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Visitors record,
        @Param("example") VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Visitors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Visitors record);
}