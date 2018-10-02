/*
*
* OsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Os;
import cn.org.escience.log.api.model.OsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Os record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Os record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Os> selectByExample(OsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Os selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Os record, @Param("example") OsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Os record, @Param("example") OsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Os record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Os record);
}