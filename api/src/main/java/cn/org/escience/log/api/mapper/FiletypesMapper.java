/*
*
* FiletypesMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Filetypes;
import cn.org.escience.log.api.model.FiletypesExample;
import cn.org.escience.log.api.model.FiletypesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletypesMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(FiletypesKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Filetypes> selectByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Filetypes selectByPrimaryKey(FiletypesKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Filetypes record);
}