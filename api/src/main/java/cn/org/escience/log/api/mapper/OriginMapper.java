/*
*
* OriginMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Origin;
import cn.org.escience.log.api.model.OriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String from);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Origin record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Origin record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Origin> selectByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Origin selectByPrimaryKey(String from);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Origin record,
        @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Origin record, @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Origin record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Origin record);
}