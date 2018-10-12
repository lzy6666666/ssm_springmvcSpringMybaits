package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.GuanggaoMapper;
import com.tzhu.ssm.domain.Guanggao;
import com.tzhu.ssm.service.GuanggaoBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "guanggaoBizI")
public class GuanggaoBizImpl implements GuanggaoBizI {

    GuanggaoMapper guanggaoMapper;//dao的set注入
    @Resource
    public void setGuanggaoMapper(GuanggaoMapper guanggaoMapper) {
        this.guanggaoMapper = guanggaoMapper;
    }


    @Override
    public List<Guanggao> search() {

        return guanggaoMapper.selectByExample(null);
    }
}
