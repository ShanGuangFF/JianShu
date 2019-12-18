package com.xupt.ff.JianShu.controller;


import com.xupt.ff.JianShu.domain.requestType.userRegister;
import com.xupt.ff.JianShu.domain.returnType.userInf;
import com.xupt.ff.JianShu.domain.returnType.userReturn;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


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
    public @ResponseBody userReturn login(@RequestBody user loginUser){
        userReturn userReturn = userService.login(loginUser);
        return userReturn;
    }

    @RequestMapping("/register")
    public @ResponseBody userReturn register(@RequestBody userRegister userRegister){

        userReturn userReturn = userService.register(userRegister);
        return userReturn;
    }

    @RequestMapping("myFocus")
    public @ResponseBody userReturn myFocus(@RequestBody HashMap<String,String> map){

        String userId = map.get("userId");
        userReturn userReturn = userService.findUserFocus(Integer.valueOf(userId));
        return userReturn;
    }

    @RequestMapping("myFollowers")
    public @ResponseBody userReturn myFollowers(@RequestBody HashMap<String,String> map){

        String userId = map.get("userId");
        userReturn userReturn = userService.findUserFollow(Integer.valueOf(userId));
        return userReturn;
    }

    @RequestMapping("focus")
    public @ResponseBody boolean focus(@RequestBody HashMap<String,String> map){

        String userId = map.get("userId");
        String fanId = map.get("fanId");
        boolean focus = userService.focus(Integer.valueOf(userId), Integer.valueOf(fanId));
        return focus;
    }
}
