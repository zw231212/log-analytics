/*
*
* FiletypesMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Filetypes;
import cn.org.escience.log.api.model.FiletypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletypesMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String type);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Filetypes> selectByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Filetypes selectByPrimaryKey(String type);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Filetypes record);
}