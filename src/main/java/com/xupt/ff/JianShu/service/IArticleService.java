package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.returnType.collectType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-21:53
 */


public interface IArticleService {

    List<article> myArticle(int userId);

    List<collectType> myCollect(int userId);


}
