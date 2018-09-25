/*
*
* UnkbrowserMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Unkbrowser;
import cn.org.escience.log.api.model.UnkbrowserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnkbrowserMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Unkbrowser> selectByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Unkbrowser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Unkbrowser record,
        @Param("example") UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Unkbrowser record,
        @Param("example") UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Unkbrowser record);
}