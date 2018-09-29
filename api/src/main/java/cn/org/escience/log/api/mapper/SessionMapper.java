/*
*
* SessionMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Session;
import cn.org.escience.log.api.model.SessionExample;
import cn.org.escience.log.api.model.SessionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(SessionKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Session record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Session record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Session> selectByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Session selectByPrimaryKey(SessionKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Session record,
        @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Session record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Session record);
}