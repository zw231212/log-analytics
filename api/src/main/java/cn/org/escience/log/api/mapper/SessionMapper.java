/*
*
* SessionMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Session;
import cn.org.escience.log.api.model.SessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String range);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Session record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Session record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Session> selectByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Session selectByPrimaryKey(String range);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Session record,
        @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Session record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Session record);
}