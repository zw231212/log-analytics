/*
*
* ErrorsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(ErrorsKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Errors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Errors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Errors> selectByExample(ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Errors selectByPrimaryKey(ErrorsKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Errors record,
        @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Errors record, @Param("example") ErrorsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Errors record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Errors record);
}