package com.xupt.ff.JianShu.dao;


import com.xupt.ff.JianShu.domain.articleCollect;
import com.xupt.ff.JianShu.domain.returnType.collectType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:18
 */
public interface IArticleCollectDao {

    //建立新收藏
    @Insert("insert into articleCollect (articleId,userId) values(#{articleId},#{userId})")
    int insert(articleCollect collect);

    //取消收藏
    @Delete("delete from articleCollect userId = #{userId} and articleId = #{articleId}")
    int delete(articleCollect collect);

    //查询收藏数
    @Select("select count(*) from articleCollect where articleId = #{articleId} ")
    int collectNum(int articleId);


    //查询收藏的文章内容
    @Select("SELECT a.*,uI.name FROM articleCollect ac\n" +
            "\tINNER JOIN article a ON a.articleId = ac.articleId\n" +
            "\tINNER JOIN userInformation uI ON a.userId = uI.id\n" +
            "\tWHERE ac.userId = #{userId};")
    List<collectType> collectArticle(int userId);
}
