package com.xupt.ff.JianShu.domain;



/**
 * @author cc_ff
 * @creat 2019-12-2019/12/5-9:04
 */
public class article {

    private int articleId;
    private String articleHeading;
    private String articleContent;
    private int userId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleHeading() {
        return articleHeading;
    }

    public void setArticleHeading(String articleHeading) {
        this.articleHeading = articleHeading;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "article{" +
                "articleId=" + articleId +
                ", articleHeading='" + articleHeading + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", userId=" + userId +
                '}';
    }
}
