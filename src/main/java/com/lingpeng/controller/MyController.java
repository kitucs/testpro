package com.lingpeng.controller;

import com.lingpeng.entity.SecKill;
import com.lingpeng.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
@Controller
public class MyController {
    @Autowired
    MyService myService;

    //查询指定id
    @RequestMapping("/test")
    @ResponseBody
    public int queryById(){
        System.out.println("controller"+1000);
        return myService.queryById(1000);
    }

}
