/*
*
* PagesMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Pages;
import cn.org.escience.log.api.model.PagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PagesMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(PagesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(PagesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Pages record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Pages record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Pages> selectByExample(PagesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Pages selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Pages record,
        @Param("example") PagesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Pages record, @Param("example") PagesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Pages record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Pages record);
}