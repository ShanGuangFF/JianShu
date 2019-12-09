package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.article;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/5-9:03
 */
@Repository
public interface IArticle {


    //根据用户ID查询所有属于他的文章
    @Select("select * from article where id = #{userId}")
    List<article> myArticle(int userId);

    //使用连接查询用户收藏的文章
    @Select("select user from userCollect ")
    List<article> collectArticle(int userId);
}
