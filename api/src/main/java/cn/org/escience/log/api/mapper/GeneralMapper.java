/*
*
* GeneralMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.General;
import cn.org.escience.log.api.model.GeneralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(General record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(General record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<General> selectByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    General selectByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") General record,
        @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") General record, @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(General record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(General record);
}