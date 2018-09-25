/*
*
* SearchrefMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchref;
import cn.org.escience.log.api.model.SearchrefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchrefMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Searchref> selectByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Searchref selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Searchref record);
}