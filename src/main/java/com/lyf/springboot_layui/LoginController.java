package com.lyf.springboot_layui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 用户登录 注册 退出 忘记密码 功能
 * @author LYF
 * @date 2018/9/19 17:11
 */

@Controller
public class LoginController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/")
    public String login(){
        return "system/user/login";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/reg")
    public String reg(){
        return "system/user/reg";
    }

    /**
     * 忘记页=密码页面
     * @return
     */
    @RequestMapping("/forget")
    public String forget(){
        return "system/user/forget";
    }


    /**
     * 登录接口
     */
    @RequestMapping("/login")
    @ResponseBody
    public Map login(String username,String password){
        Map map= new HashMap<>();
        Map a = new HashMap();
        a.put("access_token","c262e61cd13ad99fc650e6908c7e5e65b63d2f32185ecfed6b801ee3fbdd5c0a");
        map.put("code","0");
        map.put("msg","成功");
        map.put("data",a);
        return map;
    }
}
