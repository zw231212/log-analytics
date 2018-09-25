/*
*
* ErrorsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.model.ErrorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorsMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Errors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Errors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Errors> selectByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Errors selectByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Errors record,
        @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Errors record, @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Errors record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Errors record);
}