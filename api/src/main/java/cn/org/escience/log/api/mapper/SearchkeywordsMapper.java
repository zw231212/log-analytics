/*
*
* SearchkeywordsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchkeywords;
import cn.org.escience.log.api.model.SearchkeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchkeywordsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Searchkeywords> selectByExample(SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Searchkeywords selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Searchkeywords record,
        @Param("example") SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Searchkeywords record,
        @Param("example") SearchkeywordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Searchkeywords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Searchkeywords record);
}