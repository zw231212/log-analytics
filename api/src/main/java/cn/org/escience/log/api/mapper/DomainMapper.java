/*
*
* DomainMapper.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Domain;
import cn.org.escience.log.api.model.DomainExample;
import cn.org.escience.log.api.model.DomainKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainMapper {
    /**
     *
     * @mbg.generated 2018-09-29
     */
    long countByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int deleteByPrimaryKey(DomainKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insert(Domain record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int insertSelective(Domain record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    List<Domain> selectByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    Domain selectByPrimaryKey(DomainKey key);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExampleSelective(@Param("record") Domain record,
        @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByExample(@Param("record") Domain record, @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKeySelective(Domain record);

    /**
     *
     * @mbg.generated 2018-09-29
     */
    int updateByPrimaryKey(Domain record);
}