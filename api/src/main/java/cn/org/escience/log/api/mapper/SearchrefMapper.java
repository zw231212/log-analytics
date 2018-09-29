/*
*
* SearchrefMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchref;
import cn.org.escience.log.api.model.SearchrefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchrefMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Searchref> selectByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Searchref selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Searchref record);
}