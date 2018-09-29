/*
*
* OriginMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Origin;
import cn.org.escience.log.api.model.OriginExample;
import cn.org.escience.log.api.model.OriginKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(OriginKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Origin record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Origin record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Origin> selectByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Origin selectByPrimaryKey(OriginKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Origin record,
        @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Origin record, @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Origin record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Origin record);
}