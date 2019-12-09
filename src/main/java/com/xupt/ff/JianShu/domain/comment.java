package com.xupt.ff.JianShu.domain;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-1:51
 */
public class comment {

    private int commentId;
    private String commentContent;
    private int userId;
    private int articleId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
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
        return "comment{" +
                "commentId=" + commentId +
                ", commentContent='" + commentContent + '\'' +
                ", userId=" + userId +
                ", articleId=" + articleId +
                '}';
    }
}
