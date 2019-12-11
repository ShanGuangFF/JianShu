package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.followers;
import com.xupt.ff.JianShu.domain.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:13
 */
@Repository
public interface IFollowers {



    //根据用户id查询所有关注
    @Select("select * from followers where fanId = #{fanId}")
    List<user> findFocus(int fanId);

    //关注
    @Insert("insert into followers (userId,fanId,flag) values(#{userId},#{fanId},#{flag})")
    int insert(followers followers);

    //取关
    @Delete("delete from followers where userId = #{userId} and fanId = #{fanId}")
    int delete(followers followers);

    //查询所有粉丝的信息
    @Select("SELECT u.* FROM followers f INNER JOIN userInformation u ON f.fanId = u.id WHERE userId = #{userId}")
    List<user> findFollowers(int userId);

    //查询所有关注的信息
    @Select("SELECT u.* FROM followers f INNER JOIN userInformation u ON f.fanId = u.id WHERE fanId = #{fanId}")
    List<user> findFocusInf(int fanId);
}
