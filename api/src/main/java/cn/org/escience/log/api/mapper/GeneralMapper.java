/*
*
* GeneralMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.General;
import cn.org.escience.log.api.model.GeneralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(General record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(General record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<General> selectByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    General selectByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") General record,
        @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") General record, @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(General record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(General record);
}