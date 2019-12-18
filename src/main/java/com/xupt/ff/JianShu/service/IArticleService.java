package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.comment;
import com.xupt.ff.JianShu.domain.returnType.articleReturn;


import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-21:53
 */


public interface IArticleService {

    articleReturn myArticle(int userId);

    articleReturn myCollect(int userId);

    articleReturn findAll();

    articleReturn writeArticle(article article);

    articleReturn writeComment(comment comment);
}
