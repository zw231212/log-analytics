/*
*
* PagerefMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Pageref;
import cn.org.escience.log.api.model.PagerefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PagerefMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(PagerefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(PagerefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Pageref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Pageref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Pageref> selectByExample(PagerefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Pageref selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Pageref record,
        @Param("example") PagerefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Pageref record, @Param("example") PagerefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Pageref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Pageref record);
}