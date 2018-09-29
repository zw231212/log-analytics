/*
*
* HoursMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Hours;
import cn.org.escience.log.api.model.HoursExample;
import cn.org.escience.log.api.model.HoursKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoursMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(HoursKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Hours record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Hours record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Hours> selectByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Hours selectByPrimaryKey(HoursKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Hours record,
        @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Hours record, @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Hours record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Hours record);
}