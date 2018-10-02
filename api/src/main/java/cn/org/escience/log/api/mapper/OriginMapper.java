/*
*
* OriginMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Origin;
import cn.org.escience.log.api.model.OriginExample;
import cn.org.escience.log.api.model.OriginKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(OriginKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Origin record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Origin record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Origin> selectByExample(OriginExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Origin selectByPrimaryKey(OriginKey key);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Origin record,
        @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Origin record, @Param("example") OriginExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Origin record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Origin record);
}