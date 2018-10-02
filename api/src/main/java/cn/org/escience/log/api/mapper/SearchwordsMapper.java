/*
*
* SearchwordsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchwords;
import cn.org.escience.log.api.model.SearchwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchwordsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Searchwords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Searchwords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Searchwords> selectByExample(SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Searchwords selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Searchwords record,
        @Param("example") SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Searchwords record,
        @Param("example") SearchwordsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Searchwords record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Searchwords record);
}