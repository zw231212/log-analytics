/*
*
* WormsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Worms;
import cn.org.escience.log.api.model.WormsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WormsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Worms record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Worms record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Worms> selectByExample(WormsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Worms selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Worms record,
        @Param("example") WormsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Worms record, @Param("example") WormsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Worms record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Worms record);
}