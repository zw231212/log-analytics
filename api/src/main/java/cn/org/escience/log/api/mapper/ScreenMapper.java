/*
*
* ScreenMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Screen;
import cn.org.escience.log.api.model.ScreenExample;
import cn.org.escience.log.api.model.ScreenKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScreenMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(ScreenKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Screen record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Screen record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Screen> selectByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Screen selectByPrimaryKey(ScreenKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Screen record,
        @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Screen record, @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Screen record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Screen record);
}