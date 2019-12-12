package com.xupt.ff.JianShu.service;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-23:54
 */
public interface IImgService {

    int saveUserPic(MultipartFile upload,String path,int userId) throws IOException;

    int saveArticlePic(MultipartFile upload,String path,int articleId) throws IOException;
}
