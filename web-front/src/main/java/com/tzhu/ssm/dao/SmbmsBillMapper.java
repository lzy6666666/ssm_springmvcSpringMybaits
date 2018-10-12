package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.domain.SmbmsBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    List<SmbmsBill> selectByExample(SmbmsBillExample example);

    SmbmsBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByExample(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);
}