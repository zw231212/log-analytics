/*
*
* UnkosMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Unkos;
import cn.org.escience.log.api.model.UnkosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnkosMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Unkos record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Unkos record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Unkos> selectByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Unkos selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Unkos record,
        @Param("example") UnkosExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Unkos record, @Param("example") UnkosExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Unkos record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Unkos record);
}