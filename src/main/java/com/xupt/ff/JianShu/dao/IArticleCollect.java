package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.articleCollect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:18
 */
public interface IArticleCollect {

    //建立新收藏
    @Insert("insert into articleCollect (articleId,userId) values(#{articleId},#{userId})")
    int collect(articleCollect collect);

    //取消收藏
    @Delete("delete from articleCollect userId = #{userId} and articleId = #{articleId}")
    int delete(articleCollect collect);

    //查询收藏数
    @Select("select count(*) from articleCollect where articleId = #{articleId} ")
    int collectNum(int articleId);
}
