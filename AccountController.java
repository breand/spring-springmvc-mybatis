package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：查询所有用户");
        return "list";
    }
}

