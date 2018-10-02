/*
*
* DomainMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    long countByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(DomainKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Domain record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Domain record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Domain> selectByExample(DomainExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Domain selectByPrimaryKey(DomainKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Domain record,
        @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Domain record, @Param("example") DomainExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Domain record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Domain record);
}