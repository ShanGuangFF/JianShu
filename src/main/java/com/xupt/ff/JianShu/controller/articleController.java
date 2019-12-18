package com.xupt.ff.JianShu.controller;

import com.xupt.ff.JianShu.domain.article;
import com.xupt.ff.JianShu.domain.comment;
import com.xupt.ff.JianShu.domain.returnType.articleReturn;
import com.xupt.ff.JianShu.service.Impl.articleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/17-21:29
 */
@Controller
@RequestMapping("article")
public class articleController {

    @Autowired
    private articleServiceImpl articleService;

    @RequestMapping("index")
    public @ResponseBody articleReturn indexArticle(){
        articleReturn articleReturn = articleService.findAll();
        return articleReturn;
    }

    @RequestMapping("myArticle")
    public @ResponseBody articleReturn myArticle(@RequestBody HashMap<String, String> map){

        String userId = map.get("userId");
        articleReturn articleReturn = articleService.myArticle(Integer.valueOf(userId));
        return articleReturn;
    }

    @RequestMapping("myCollect")
    public @ResponseBody articleReturn myCollect(@RequestBody HashMap<String,String> map){
        String userId = map.get("userId");
        articleReturn articleReturn = articleService.myCollect(Integer.valueOf(userId));
        return articleReturn;
    }

    @RequestMapping("writeArticle")
    private @ResponseBody articleReturn writeArticle(@RequestBody article article){
        articleReturn articleReturn = articleService.writeArticle(article);
        return articleReturn;
    }

    @RequestMapping("writeComment")
    public @ResponseBody articleReturn writeComment(@RequestBody comment comment){
        articleReturn articleReturn = articleService.writeComment(comment);

        return articleReturn;
    }
}
