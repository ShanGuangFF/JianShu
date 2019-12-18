package com.xupt.ff.JianShu.service.Impl;

import com.xupt.ff.JianShu.dao.IFollowersDao;
import com.xupt.ff.JianShu.dao.IImgDao;
import com.xupt.ff.JianShu.dao.IUserDao;
import com.xupt.ff.JianShu.dao.IUserInformationDao;
import com.xupt.ff.JianShu.domain.Img;
import com.xupt.ff.JianShu.domain.followers;
import com.xupt.ff.JianShu.domain.requestType.userRegister;
import com.xupt.ff.JianShu.domain.returnType.userInf;
import com.xupt.ff.JianShu.domain.returnType.userReturn;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import com.xupt.ff.JianShu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-2:01
 */

@Service("userService")
public class userServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IUserInformationDao informationDao;

    @Autowired
    private IFollowersDao followerDao;

    @Autowired
    private IImgDao imgDao;

    //登录返回用户的所有信息
    @Override
    public userReturn login(user loginUser) {

        userReturn userReturn = new userReturn();
        userReturn.setFlag(false);
        user user = userDao.login(loginUser);
        if (user != null){
            userReturn.setFlag(true);
            userInformation userInf = informationDao.findById(user.getUserId());
            ArrayList<userInformation> informations = new ArrayList<>();
            informations.add(userInf);
            userReturn.setUserList(informations);
            return userReturn;
        }
        return userReturn;

    }


    //粉丝信息
    @Override
    public userReturn findUserFollow(int userId) {

        userReturn userReturn = new userReturn();
        userReturn.setFlag(false);
        List<userInformation> followers = followerDao.findFollowers(userId);
        if (followers != null){
            userReturn.setFlag(true);
            userReturn.setUserList(followers);
            return userReturn;
        }
        return userReturn;
    }

    //注册
    public userReturn register(userRegister userRegister){
        user user = new user();
        user.setUserName(userRegister.getPhoneNumber());
        user.setUserPassword(userRegister.getUserPassword());
        String imagePath = "e7c4512142ccb38fc1a39f17a517_5a126b4a4a7c9.jpg";

        userReturn userReturn = new userReturn();
        userReturn.setFlag(false);
        user login =  userDao.login(user);
        if (login == null){
            //注册账号
            userDao.insert(user);

            userInformation information = new userInformation();
            information.setEmail(userRegister.getEmail());
            information.setName(userRegister.getName());
            information.setPhoneNumber(userRegister.getPhoneNumber());
            information.setSex(userRegister.getSex());

            //填入信息
            login = userDao.login(user);
            information.setId(login.getUserId());
            informationDao.insert(information);

            //初始化头像
            Img img = new Img();
            img.setUserId(login.getUserId());
            img.setImagePath("e7c4512142ccb38fc1a39f17a517_5a126b4a4a7c9.jpg");
            imgDao.initUserPic(img);

            userInf userInf = new userInf(login.getUserId(), information.getName(),
                    information.getSex(), information.getPhoneNumber(),
                    information.getEmail(), login.getUserPassword());

            userInf.setUserImg(img.getImagePath());

            userReturn.setFlag(true);
            ArrayList<userInf> userInfs = new ArrayList<>();
            userInfs.add(userInf);
            userReturn.setUserList(userInfs);

            return userReturn;
        }
        return userReturn;
    }

    //关注列表
    public userReturn findUserFocus(int userId){

        userReturn userReturn = new userReturn();
        userReturn.setFlag(false);
        List<userInformation> focus = followerDao.findFocusInf(userId);
        if (focus != null) {
            userReturn.setFlag(true);
            userReturn.setUserList(focus);
        }
        return userReturn;
    }

    @Override
    public boolean focus(int userId,int fanId) {
        followers follower = new followers();
        follower.setUserId(userId);
        follower.setFanId(fanId);
        user oneFocus = followerDao.findOneFocus(follower);
        if (oneFocus == null){
            followerDao.insert(follower);
            return true;
        }
        return false;
    }
}
