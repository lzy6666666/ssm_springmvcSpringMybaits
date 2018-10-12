package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.domain.SmbmsProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsProviderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsProvider record);

    int insertSelective(SmbmsProvider record);

    List<SmbmsProvider> selectByExample(SmbmsProviderExample example);

    SmbmsProvider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsProvider record, @Param("example") SmbmsProviderExample example);

    int updateByExample(@Param("record") SmbmsProvider record, @Param("example") SmbmsProviderExample example);

    int updateByPrimaryKeySelective(SmbmsProvider record);

    int updateByPrimaryKey(SmbmsProvider record);
}