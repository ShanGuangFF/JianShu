package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.user;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:13
 */
@Repository
public interface IFollowers {

    //根据用户id查询所有粉丝
    @Select("select * from followers where userId = #{userId}")
    List<user> findFollowers(int userId);

    //根据用户id查询所有关注
    @Select("select * from followers where fanId = #{fanId}")
    List<user> findFocus(int fanId);


}
