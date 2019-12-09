package com.xupt.ff.JianShu.controller;


import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.service.IUserService;
import com.xupt.ff.JianShu.service.Impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-2:07
 */

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public @ResponseBody user login(@RequestBody user loginUser){
        List<user> users = userService.findAll();
        System.out.println(users);
        return loginUser;
    }


}
