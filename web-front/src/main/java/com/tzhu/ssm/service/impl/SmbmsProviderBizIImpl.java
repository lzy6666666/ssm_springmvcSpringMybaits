package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.SmbmsProviderMapper;
import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.service.SmbmsProviderBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Service("SmbmsProviderBizi")
public class SmbmsProviderBizIImpl implements SmbmsProviderBizI {
    @Resource
    SmbmsProviderMapper smbmsProviderMapper;
    @Override
    public List<SmbmsProvider> serch() {
        List<SmbmsProvider> smbmsProviders = smbmsProviderMapper.selectByExample(null);
        return smbmsProviders;
    }
}
