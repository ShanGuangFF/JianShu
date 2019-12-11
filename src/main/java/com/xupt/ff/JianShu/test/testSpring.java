package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.service.IUserService;
import com.xupt.ff.JianShu.service.Impl.userServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-2:02
 */
public class testSpring {


    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IUserService userService = ac.getBean("userService", userServiceImpl.class);
        System.out.println(userService);
    }



}
