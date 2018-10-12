package com.tzhu.ssm.controller;


import com.tzhu.ssm.domain.Team;
import com.tzhu.ssm.service.TeamBizI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "team")
public class TeamController {

    //注入业务层代码
    //@Autowired
    TeamBizI teamBizI;

    @Resource(name = "teamBizI")
    public void setTeamBizI(TeamBizI teamBizI) {

        System.out.println(" teamBizI  spring is ok.................... ");
        this.teamBizI = teamBizI;
    }

    @RequestMapping("search")
    public ModelAndView search() {


        List<Team> teamList = teamBizI.search();
        ModelAndView m = new ModelAndView("team");
        m.addObject("teamList", teamList);

        return m;


    }


}
