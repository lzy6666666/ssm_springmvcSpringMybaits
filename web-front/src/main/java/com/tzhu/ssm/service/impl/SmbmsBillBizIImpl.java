package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.SmbmsBillMapper;
import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.service.SmbmsBillBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Service("SmbmsBillBizI")
public class SmbmsBillBizIImpl implements SmbmsBillBizI {

    @Resource
    SmbmsBillMapper smbmsBillMapper;

    @Override
    public List<SmbmsBill> search() {

        List<SmbmsBill> smbmsBills = smbmsBillMapper.selectByExample(null);
        return smbmsBills;
    }
}
