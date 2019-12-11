package com.xupt.ff.JianShu.domain.returnType;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-21:45
 */
public class collectType {

    private int articleId;
    private String articleHeading;
    private String articleContent;
    private int userId;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "collectType{" +
                "articleId=" + articleId +
                ", articleHeading='" + articleHeading + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
