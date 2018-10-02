/*
*
* VisitorsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Visitors;
import cn.org.escience.log.api.model.VisitorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Visitors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Visitors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Visitors> selectByExample(VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Visitors selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Visitors record,
        @Param("example") VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Visitors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Visitors record);
}