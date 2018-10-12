package com.tzhu.ssm.controller;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.service.SmbmsBillBizI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Controller
public class SmbmsBillController {
    @Resource
    SmbmsBillBizI smbmsBillBizI;
    @RequestMapping("bill")
    public ModelAndView search(){

        ModelAndView modelAndView = new ModelAndView("smbmsbill");
        List<SmbmsBill> lists = smbmsBillBizI.search();
        modelAndView.addObject("lists",lists);
        return modelAndView;
    }

}
