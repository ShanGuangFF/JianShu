package com.xupt.ff.JianShu.domain.returnType;

import com.xupt.ff.JianShu.domain.article;


import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/17-21:47
 */
public class  articleReturn {
    boolean flag;
    List<?> articleList;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<?> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<?> articleList) {
        this.articleList = articleList;
    }
}
