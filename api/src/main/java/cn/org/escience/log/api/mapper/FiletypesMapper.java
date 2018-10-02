/*
*
* FiletypesMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(FiletypesKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Filetypes record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Filetypes> selectByExample(FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Filetypes selectByPrimaryKey(FiletypesKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Filetypes record,
        @Param("example") FiletypesExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Filetypes record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Filetypes record);
}