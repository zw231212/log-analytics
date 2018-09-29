/*
*
* DailyMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Daily;
import cn.org.escience.log.api.model.DailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(String day);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Daily record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Daily record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Daily> selectByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Daily selectByPrimaryKey(String day);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Daily record,
        @Param("example") DailyExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Daily record, @Param("example") DailyExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Daily record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Daily record);
}