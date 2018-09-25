/*
*
* HoursMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Hours;
import cn.org.escience.log.api.model.HoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoursMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Byte hour);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Hours record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Hours record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Hours> selectByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Hours selectByPrimaryKey(Byte hour);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Hours record,
        @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Hours record, @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Hours record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Hours record);
}