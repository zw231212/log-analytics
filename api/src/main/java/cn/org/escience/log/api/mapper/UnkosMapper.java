/*
*
* UnkosMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Unkos;
import cn.org.escience.log.api.model.UnkosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnkosMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Unkos record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Unkos record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Unkos> selectByExample(UnkosExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Unkos selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Unkos record,
        @Param("example") UnkosExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Unkos record, @Param("example") UnkosExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Unkos record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Unkos record);
}