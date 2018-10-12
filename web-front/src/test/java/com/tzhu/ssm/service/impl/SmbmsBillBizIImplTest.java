package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.service.SmbmsBillBizI;
import org.apache.log4j.Logger;
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
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SmbmsBillBizIImplTest {
    Logger logger = Logger.getLogger(SmbmsBillBizIImplTest.class);
    @Resource(name="SmbmsBillBizI")
    SmbmsBillBizI smbmsBillBizI;
    @Test
    public void testSearch() throws Exception {
        List<SmbmsBill> bills = smbmsBillBizI.search();
        logger.info("bills:"+bills.size());
    }
}