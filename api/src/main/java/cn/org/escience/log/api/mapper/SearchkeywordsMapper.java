/*
*
* SearchkeywordsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchkeywords;
import cn.org.escience.log.api.model.SearchkeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchkeywordsMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Searchkeywords> selectByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Searchkeywords selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Searchkeywords record,
        @Param("example") SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Searchkeywords record,
        @Param("example") SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Searchkeywords record);
}