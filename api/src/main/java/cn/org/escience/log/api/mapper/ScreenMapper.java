/*
*
* ScreenMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(ScreenKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Screen record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Screen record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Screen> selectByExample(ScreenExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Screen selectByPrimaryKey(ScreenKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Screen record,
        @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Screen record, @Param("example") ScreenExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Screen record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Screen record);
}