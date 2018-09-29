/*
*
* SearchwordsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchwords;
import cn.org.escience.log.api.model.SearchwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchwordsMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Searchwords record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Searchwords record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Searchwords> selectByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Searchwords selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Searchwords record,
        @Param("example") SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Searchwords record,
        @Param("example") SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Searchwords record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Searchwords record);
}