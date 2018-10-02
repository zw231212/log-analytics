/*
*
* GeneralMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.General;
import cn.org.escience.log.api.model.GeneralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(General record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(General record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<General> selectByExample(GeneralExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    General selectByPrimaryKey(String yearMonth);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") General record,
        @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") General record, @Param("example") GeneralExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(General record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(General record);
}