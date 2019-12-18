package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.requestType.userRegister;
import com.xupt.ff.JianShu.domain.returnType.collectType;
import com.xupt.ff.JianShu.domain.returnType.userInf;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import com.xupt.ff.JianShu.service.IArticleService;
import com.xupt.ff.JianShu.service.Impl.articleServiceImpl;
import com.xupt.ff.JianShu.service.Impl.userServiceImpl;
import org.apache.ibatis.annotations.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.util.List;


/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-18:51
 */
public class testService {


    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    userServiceImpl userService = ac.getBean("userService", userServiceImpl.class);
    articleServiceImpl articleService = ac.getBean("articleService", articleServiceImpl.class);



    public testService() throws IOException {
    }

    @Test
    public void testLogin(){
        user user = new user();
        user.setUserName("e909278799");
        user.setUserPassword("ljfwww666");
    }



}
