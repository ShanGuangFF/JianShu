package com.xupt.ff.JianShu.test;

import com.xupt.ff.JianShu.dao.IUserDao;
import com.xupt.ff.JianShu.dao.IUserInformationDao;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-8:25
 */
public class testMybatis  {

    private InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    private SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
    private SqlSession sqlSession = factory.openSession();
    private user user = new user();

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
        user.setUserName("e909278799");
        user.setUserPassword("ljfwww666");
        IUserDao dao = sqlSession.getMapper(IUserDao.class);
        user one = dao.findOne(user);
        System.out.println(one);

    }
}
