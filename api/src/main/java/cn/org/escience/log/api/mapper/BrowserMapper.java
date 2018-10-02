/*
*
* BrowserMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.model.BrowserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrowserMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Browser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Browser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Browser> selectByExample(BrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Browser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Browser record,
        @Param("example") BrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Browser record, @Param("example") BrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Browser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Browser record);
}