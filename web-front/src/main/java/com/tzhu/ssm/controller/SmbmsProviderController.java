package com.tzhu.ssm.controller;

import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.service.SmbmsProviderBizI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Controller
public class SmbmsProviderController {
    @Resource
    SmbmsProviderBizI smbmsProviderBizI;
    @RequestMapping("provider")
    public ModelAndView search(){

        ModelAndView modelAndView = new ModelAndView("provider");
        List<SmbmsProvider> smbmsProviders = smbmsProviderBizI.serch();
        modelAndView.addObject("smbmsProviders",smbmsProviders);

        return modelAndView;
    }

}
