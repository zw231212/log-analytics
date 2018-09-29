/*
*
* OsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Os;
import cn.org.escience.log.api.model.OsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Os record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Os record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Os> selectByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Os selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Os record, @Param("example") OsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Os record, @Param("example") OsExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Os record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Os record);
}