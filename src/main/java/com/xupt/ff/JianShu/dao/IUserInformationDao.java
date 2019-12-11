package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.userInformation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/5-8:47
 */
@Repository
public interface IUserInformationDao {

    //根据用户id查询用户信息
    @Select("select * from userInformation where id = #{id}")
    userInformation findById(int id);

    //注册新用户
    @Insert("insert into userInformation (name,sex,email,phoneNumber) values (#{name},#{sex},#{email},#{phoneNumber})")
    int insert(userInformation rU);



}
