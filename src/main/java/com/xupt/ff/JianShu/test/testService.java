package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.returnType.collectType;
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

import javax.annotation.Resource;
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
        user.setUserName("e975350374");
        user.setUserPassword("ljfmmm666");
        userInformation login = userService.login(user);

        List<article> articles = articleService.myArticle(login.getId());
        List<collectType> collectTypes = articleService.myCollect(login.getId());
        List<user> userFocus = userService.findUserFocus(user.getUserId());
        List<user> userFollow = userService.findUserFollow(user.getUserId());

        //System.out.println(login);
        System.out.println(articles);
        System.out.println(collectTypes);
        System.out.println(userFocus);
        System.out.println(userFollow);
    }


}
