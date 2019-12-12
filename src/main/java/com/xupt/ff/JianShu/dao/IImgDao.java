package com.xupt.ff.JianShu.dao;

import com.xupt.ff.JianShu.domain.Img;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Insert("insert into image (imagePath,userId) values (4e80e7c4512142ccb38fc1a39f17a517_5a126b4a4a7c9.jpg,#{userId})")
    int initUserPic(int userId);

    @Select("select * from image where userId = #{userId}")
    Img userPic(int userId);
}
