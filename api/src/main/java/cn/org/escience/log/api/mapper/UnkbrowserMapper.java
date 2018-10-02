/*
*
* UnkbrowserMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Unkbrowser;
import cn.org.escience.log.api.model.UnkbrowserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnkbrowserMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Unkbrowser> selectByExample(UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Unkbrowser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Unkbrowser record,
        @Param("example") UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Unkbrowser record,
        @Param("example") UnkbrowserExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Unkbrowser record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Unkbrowser record);
}