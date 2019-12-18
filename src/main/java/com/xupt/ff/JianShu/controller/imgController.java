package com.xupt.ff.JianShu.controller;

import com.xupt.ff.JianShu.service.IImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-23:06
 */

@Controller
@RequestMapping("/img")
public class imgController {

    @Autowired
    private IImgService imgService;

    @RequestMapping("/userPicUpload")
    public void userPicUpload(HttpServletRequest req, MultipartFile upload) throws IOException {
        String path = req.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        //imgService.saveUserPic(upload,path,userId);
    }

    @RequestMapping("/articleUpload")
    public void articlePicUpload(HttpServletRequest req, MultipartFile upload, @RequestBody int articleId) throws IOException {
        String path = req.getSession().getServletContext().getRealPath("/uploads");
        imgService.saveUserPic(upload,path,articleId);
    }
}
