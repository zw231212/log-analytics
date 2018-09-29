/*
*
* MiscMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Misc;
import cn.org.escience.log.api.model.MiscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiscMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Misc record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Misc record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Misc> selectByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Misc selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Misc record,
        @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Misc record, @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Misc record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Misc record);
}