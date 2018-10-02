/*
*
* SessionMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(SessionKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Session record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Session record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Session> selectByExample(SessionExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Session selectByPrimaryKey(SessionKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Session record,
        @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Session record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Session record);
}