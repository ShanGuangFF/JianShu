package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.dao.*;
import com.xupt.ff.JianShu.domain.Img;
import com.xupt.ff.JianShu.domain.articleCollect;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-8:25
 */
public class testMybatis  {

    private InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    private SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
    private SqlSession sqlSession = factory.openSession();

    public testMybatis() throws IOException {
    }

    @Test
    public void test()throws Exception{
        IUserInformationDao IUserInformationDao = sqlSession.getMapper(IUserInformationDao.class);
        userInformation information = IUserInformationDao.findById(1);
        System.out.println(information);
    }

    @Test
    public void testUser() throws IOException {
        user user = new user();
        user.setUserName("e909278799");
        user.setUserPassword("ljfwww666");
        IUserDao dao = sqlSession.getMapper(IUserDao.class);
        user one = dao.login(user);
        System.out.println(one);

    }

    @Test
    public void testAC(){
        IFollowersDao followersDao = sqlSession.getMapper(IFollowersDao.class);
        List<userInformation> focus = followersDao.findFocusInf(2);
        System.out.println(focus);
    }

    @Test
    public void testImg(){

        Img img = new Img();
        img.setUserId(1);
        img.setImagePath("e7c4512142ccb38fc1a39f17a517_5a126b4a4a7c9.jpg");

        IImgDao iImgDao = sqlSession.getMapper(IImgDao.class);
        int i = iImgDao.initUserPic(img);
        System.out.println(i);
    }
}
