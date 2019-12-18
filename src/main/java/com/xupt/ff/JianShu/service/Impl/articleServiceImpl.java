package com.xupt.ff.JianShu.service.Impl;


import com.fasterxml.jackson.databind.type.CollectionType;
import com.xupt.ff.JianShu.dao.IArticleCollectDao;
import com.xupt.ff.JianShu.dao.IArticleDao;
import com.xupt.ff.JianShu.dao.ICommentDao;
import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.comment;
import com.xupt.ff.JianShu.domain.returnType.articleReturn;
import com.xupt.ff.JianShu.domain.returnType.collectType;
import com.xupt.ff.JianShu.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/12-8:37
 */
@Service("articleService")
public class articleServiceImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Autowired
    private IArticleCollectDao articleCollectDao;

    @Autowired
    private ICommentDao commentDao;
    @Override
    public articleReturn myArticle(int userId) {

        articleReturn articleReturn = new articleReturn();
        articleReturn.setFlag(false);
        List<article> articles = articleDao.myArticle(userId);
        if (articles != null){
            articleReturn.setFlag(true);
            articleReturn.setArticleList(articles);
            return articleReturn;
        }

        return articleReturn;
    }

    @Override
    public articleReturn myCollect(int userId) {
        articleReturn articleReturn = new articleReturn();
        articleReturn.setFlag(false);
        List<collectType> collectionType = articleCollectDao.collectArticle(userId);
        if (collectionType != null){
            articleReturn.setFlag(true);
            articleReturn.setArticleList(collectionType);
            return articleReturn;
        }
        return  articleReturn;
    }

    @Override
    public articleReturn findAll() {
        List<article> articleList = articleDao.findAll();
        articleReturn articleReturn = new articleReturn();
        articleReturn.setFlag(false);
        if (articleList != null){
            articleReturn.setArticleList(articleList);
            articleReturn.setFlag(true);
            return articleReturn;
        }

        return articleReturn;
    }

    @Override
    public articleReturn writeArticle(article article) {

        int insert = articleDao.insert(article);
        articleReturn articleReturn = new articleReturn();
        articleReturn.setFlag(false);
        if (insert == 1){

            articleReturn.setFlag(true);
            ArrayList<article> articles = new ArrayList<>();
            articles.add(article);
            articleReturn.setArticleList(articles);
            return articleReturn;
        }

        return articleReturn;
    }

    @Override
    public articleReturn writeComment(comment comment) {
        int insert = commentDao.insert(comment);
        articleReturn articleReturn = new articleReturn();
        articleReturn.setFlag(false);
        if (insert == 1){
            articleReturn.setFlag(true);
            ArrayList<comment> articles = new ArrayList<>();
            articles.add(comment);
            articleReturn.setArticleList(articles);
            return articleReturn;
        }
        return articleReturn;
    }


}
