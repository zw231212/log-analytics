/*
*
* Errors404Mapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors404;
import cn.org.escience.log.api.model.Errors404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Errors404Mapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Errors404 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Errors404 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Errors404> selectByExample(Errors404Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Errors404 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Errors404 record,
        @Param("example") Errors404Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Errors404 record,
        @Param("example") Errors404Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Errors404 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Errors404 record);
}