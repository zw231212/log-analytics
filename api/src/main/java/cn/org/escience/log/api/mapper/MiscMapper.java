/*
*
* MiscMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Misc;
import cn.org.escience.log.api.model.MiscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiscMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Misc record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Misc record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Misc> selectByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Misc selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Misc record,
        @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Misc record, @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Misc record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Misc record);
}