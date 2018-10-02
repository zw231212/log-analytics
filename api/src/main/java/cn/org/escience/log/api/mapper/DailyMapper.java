/*
*
* DailyMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Daily;
import cn.org.escience.log.api.model.DailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(String day);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Daily record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Daily record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Daily> selectByExample(DailyExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Daily selectByPrimaryKey(String day);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Daily record,
        @Param("example") DailyExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Daily record, @Param("example") DailyExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Daily record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Daily record);
}