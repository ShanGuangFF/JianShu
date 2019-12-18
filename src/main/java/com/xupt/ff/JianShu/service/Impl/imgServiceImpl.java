package com.xupt.ff.JianShu.service.Impl;

import com.xupt.ff.JianShu.dao.IImgDao;
import com.xupt.ff.JianShu.domain.Img;
import com.xupt.ff.JianShu.service.IImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-23:56
 */

@Service("imgService")
public class imgServiceImpl implements IImgService {

    @Autowired
    private IImgDao imgDao;

    @Override
    public int saveUserPic(MultipartFile upload,String path,int userId) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        filename = uuid+"_"+filename;
        upload.transferTo(new File(path,filename));
        Img img = new Img();
        img.setImagePath(filename);
        img.setUserId(userId);


        imgDao.saveUserPic(img);

        return 1;
    }

    @Override
    public int saveArticlePic(MultipartFile upload, String path,int articleId) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        filename = uuid+"_"+filename;
        upload.transferTo(new File(path,filename));
        Img img = new Img();
        img.setImagePath(filename);
        img.setUserId(articleId);
        imgDao.saveUserPic(img);

        return 1;
    }
}
