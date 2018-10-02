/*
*
* Errors403Mapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Errors403;
import cn.org.escience.log.api.model.Errors403Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Errors403Mapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(Errors403Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(Errors403Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Errors403 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Errors403 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Errors403> selectByExample(Errors403Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Errors403 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Errors403 record,
        @Param("example") Errors403Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Errors403 record,
        @Param("example") Errors403Example example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Errors403 record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Errors403 record);
}