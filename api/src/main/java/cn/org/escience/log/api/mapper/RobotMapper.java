/*
*
* RobotMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Robot;
import cn.org.escience.log.api.model.RobotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(RobotExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(RobotExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Robot record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Robot record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Robot> selectByExample(RobotExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Robot selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Robot record,
        @Param("example") RobotExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Robot record, @Param("example") RobotExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Robot record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Robot record);
}