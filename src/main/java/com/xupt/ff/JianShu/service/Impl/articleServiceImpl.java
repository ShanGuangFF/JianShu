package com.xupt.ff.JianShu.service.Impl;


import com.fasterxml.jackson.databind.type.CollectionType;
import com.xupt.ff.JianShu.dao.IArticleCollectDao;
import com.xupt.ff.JianShu.dao.IArticleDao;
import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.returnType.collectType;
import com.xupt.ff.JianShu.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Override
    public List<article> myArticle(int userId) {
        List<article> articles = articleDao.myArticle(userId);
        return articles;
    }

    @Override
    public List<collectType> myCollect(int userId) {
        List<collectType> collectionType = articleCollectDao.collectArticle(userId);
        return  collectionType;
    }
}
