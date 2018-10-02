/*
*
* SearchrefMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Searchref;
import cn.org.escience.log.api.model.SearchrefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchrefMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Searchref record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Searchref> selectByExample(SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Searchref selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Searchref record,
        @Param("example") SearchrefExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Searchref record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Searchref record);
}