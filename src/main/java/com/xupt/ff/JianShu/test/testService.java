package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.dao.IArticleCollect;
import com.xupt.ff.JianShu.dao.IUserDao;
import com.xupt.ff.JianShu.domain.articleCollect;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import com.xupt.ff.JianShu.service.IUserService;
import com.xupt.ff.JianShu.service.Impl.userServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;


/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-18:51
 */
public class testService {


    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    userServiceImpl userService = ac.getBean("userService", userServiceImpl.class);

    @Autowired
    IUserDao userDao;

    @Autowired
    IArticleCollect Collect;

    public testService() throws IOException {
    }

    @Test
    public void testLogin(){
        user user = new user();
        user.setUserName("e909278799");
        user.setUserPassword("ljfwww666");
        userInformation login = userService.login(user);
        System.out.println(login);
    }


}
