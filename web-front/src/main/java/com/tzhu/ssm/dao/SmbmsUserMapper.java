package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsUser;
import com.tzhu.ssm.domain.SmbmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsUser record);

    int insertSelective(SmbmsUser record);

    List<SmbmsUser> selectByExample(SmbmsUserExample example);

    SmbmsUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsUser record, @Param("example") SmbmsUserExample example);

    int updateByExample(@Param("record") SmbmsUser record, @Param("example") SmbmsUserExample example);

    int updateByPrimaryKeySelective(SmbmsUser record);

    int updateByPrimaryKey(SmbmsUser record);
}