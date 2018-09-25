/*
*
* DomainMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Domain;
import cn.org.escience.log.api.model.DomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainMapper {
    /**
     *
     * @mbg.generated 2018-09-21
     */
    long countByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insert(Domain record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int insertSelective(Domain record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    List<Domain> selectByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    Domain selectByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") Domain record,
        @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByExample(@Param("record") Domain record, @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKeySelective(Domain record);

    /**
     *
     * @mbg.generated 2018-09-21
     */
    int updateByPrimaryKey(Domain record);
}