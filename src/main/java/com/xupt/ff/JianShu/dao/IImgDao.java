package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.Img;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-23:45
 */
@Repository
public interface IImgDao {


    //存用户图片
    @Update("update image set imagePath = #{imagePath} where userId = #{userId}")
    int saveUserPic(Img img);

    //存文章图片
    @Insert("insert into image (imagePath,userId) values (#{imagePath},#{articleId})")
    int saveArticlePic(Img img);

    @Insert("insert into image (imagePath,userId) values (#{imagePath},#{userId})")
    int initUserPic(Img img);

    @Select("select * from image where userId = #{userId}")
    Img userPic(int userId);
}
