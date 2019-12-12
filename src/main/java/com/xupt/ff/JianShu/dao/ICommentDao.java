package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-1:50
 */
@Repository
public interface ICommentDao {

    //查询文章所有的评论
    @Select("select * from comment where articleId = #{articleId}")
    List<comment> findOneArticle(int articleId);

    //查询单个用户的所用评论
    @Select("select * from comment where articleId = #{userId}")
    List<comment> findByUser(int userId);

    //建立新评论
    @Insert("insert into comment (commentContent,userId,articleId) values(#{commentContent},#{userId},#{articleId})")
    int insert(comment comment);
}
