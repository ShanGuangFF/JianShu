package com.xupt.ff.JianShu.domain;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-23:46
 */
public class Img {

    private int imageId;
    private String imagePath;
    private int userId;
    private int articleId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "Img{" +
                "imageId=" + imageId +
                ", imagePath='" + imagePath + '\'' +
                ", userId=" + userId +
                ", articleId=" + articleId +
                '}';
    }
}
