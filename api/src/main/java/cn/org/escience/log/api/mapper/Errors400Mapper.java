/*
*
* Errors400Mapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors400;
import cn.org.escience.log.api.model.Errors400Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Errors400Mapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(Errors400Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(Errors400Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Errors400 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Errors400 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Errors400> selectByExample(Errors400Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Errors400 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Errors400 record,
        @Param("example") Errors400Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Errors400 record,
        @Param("example") Errors400Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Errors400 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Errors400 record);
}