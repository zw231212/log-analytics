/*
*
* ErrorsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.model.ErrorsExample;
import cn.org.escience.log.api.model.ErrorsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorsMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(ErrorsKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Errors record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Errors record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Errors> selectByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Errors selectByPrimaryKey(ErrorsKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Errors record,
        @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Errors record, @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Errors record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Errors record);
}