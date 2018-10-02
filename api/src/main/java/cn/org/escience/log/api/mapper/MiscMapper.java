/*
*
* MiscMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Misc;
import cn.org.escience.log.api.model.MiscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiscMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Misc record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Misc record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Misc> selectByExample(MiscExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Misc selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Misc record,
        @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Misc record, @Param("example") MiscExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Misc record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Misc record);
}