package com.study.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.study.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UmsMemberController {

    @Reference
    UmsMemberService umsMemberService;

    @RequestMapping("/")
    public String toIndex(){
        System.out.println("******666666666******");
        return "index";
    }

    @GetMapping("/umsList")
    public String getUmsList(Map<String,Object> map){
        map.put("umsList",umsMemberService.getUmsList());
        return "success";
    }

}
