package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-1:52
 */
@Repository
public interface IUserDao {


    //查询所用用户
    @Select("select * from user")
    List<user> findAll();

    //登录
    @Select("select * from user where userName = #{userName} and userPassword = #{userPassword}")
    user login(user loginUser);

    //根据用户id查询用户
    @Select("select * from user where userId = #{userId}")
    user findOne(int userId);

    //注册用户名和密码
    @Insert("insert into user (userName,userPassword) value (#{userName},#{userPassword})")
    int register(user registerUser);
}
