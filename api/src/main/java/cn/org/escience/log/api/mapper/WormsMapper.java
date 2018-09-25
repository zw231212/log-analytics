/*
*
* WormsMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Worms;
import cn.org.escience.log.api.model.WormsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WormsMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Worms record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Worms record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Worms> selectByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Worms selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Worms record,
        @Param("example") WormsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Worms record, @Param("example") WormsExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Worms record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Worms record);
}