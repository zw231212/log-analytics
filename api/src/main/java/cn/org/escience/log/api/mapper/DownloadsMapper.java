/*
*
* DownloadsMapper.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.mapper;

import cn.org.escience.log.api.model.Downloads;
import cn.org.escience.log.api.model.DownloadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadsMapper {
    /**
     *
     * @mbg.generated 2018-10-02
     */
    long countByExample(DownloadsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByExample(DownloadsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insert(Downloads record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int insertSelective(Downloads record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    List<Downloads> selectByExample(DownloadsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    Downloads selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExampleSelective(@Param("record") Downloads record,
        @Param("example") DownloadsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByExample(@Param("record") Downloads record,
        @Param("example") DownloadsExample example);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKeySelective(Downloads record);

    /**
     *
     * @mbg.generated 2018-10-02
     */
    int updateByPrimaryKey(Downloads record);
}