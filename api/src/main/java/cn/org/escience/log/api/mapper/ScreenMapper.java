/*
*
* ScreenMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Screen;
import cn.org.escience.log.api.model.ScreenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScreenMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String size);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Screen record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Screen record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Screen> selectByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Screen selectByPrimaryKey(String size);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Screen record,
        @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Screen record, @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Screen record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Screen record);
}