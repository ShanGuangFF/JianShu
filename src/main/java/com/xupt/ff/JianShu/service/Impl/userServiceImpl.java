package com.xupt.ff.JianShu.service.Impl;

import com.xupt.ff.JianShu.dao.IUserDao;
import com.xupt.ff.JianShu.dao.IUserInformationDao;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;
import com.xupt.ff.JianShu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    //登录返回用户的所有信息
    @Override
    public userInformation login(user loginUser) {
        user user = userDao.login(loginUser);
        if (user != null){
            userInformation userInf = informationDao.findById(user.getUserId());
            return userInf;
        }
        return null;
    }


    @Override
    public List<user> findUserFollow(int userId) {
        return null;
    }
}
