/*
*
* HoursMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(HoursKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Hours record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Hours record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Hours> selectByExample(HoursExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Hours selectByPrimaryKey(HoursKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Hours record,
        @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Hours record, @Param("example") HoursExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Hours record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Hours record);
}