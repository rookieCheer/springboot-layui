package com.lyf.springboot_layui.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/index")
    public String index1(){
        return "index";
    }
    @RequestMapping("/1")
    public String index2(){
        return "index1";
    }
//    @RequestMapping("/index")
//    public String index(){
//        return "test";
//    }


    @RequestMapping("/test")
    public String test() {
        return "test/test1";
    }
}
