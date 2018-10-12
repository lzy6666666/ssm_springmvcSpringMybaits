package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.service.SmbmsProviderBizI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class SmbmsProviderBizIImplTest {
    @Resource
    SmbmsProviderBizI smbmsProviderBizI;
    @Test
    public void testSerch() throws Exception {
        List<SmbmsProvider> providerList = smbmsProviderBizI.serch();
        System.out.println("providerList:"+providerList.size());
    }
}