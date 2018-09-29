/*
*
* BrowserMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.model.BrowserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrowserMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Browser record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Browser record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Browser> selectByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Browser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Browser record,
        @Param("example") BrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Browser record, @Param("example") BrowserExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Browser record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Browser record);
}