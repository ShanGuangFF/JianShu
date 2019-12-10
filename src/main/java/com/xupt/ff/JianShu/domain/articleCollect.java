package com.xupt.ff.JianShu.domain;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/10-17:52
 */
public class articleCollect {

    private int collectId;
    private int articleId;
    private int userId;

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "articleCollect{" +
                "collectId=" + collectId +
                ", articleId=" + articleId +
                ", userId=" + userId +
                '}';
    }
}
