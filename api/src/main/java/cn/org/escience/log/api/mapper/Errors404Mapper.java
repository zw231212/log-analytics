/*
*
* Errors404Mapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors404;
import cn.org.escience.log.api.model.Errors404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Errors404Mapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Errors404 record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Errors404 record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Errors404> selectByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Errors404 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Errors404 record,
        @Param("example") Errors404Example example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Errors404 record,
        @Param("example") Errors404Example example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Errors404 record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Errors404 record);
}