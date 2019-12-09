package com.xupt.ff.JianShu.service.Impl;

import com.xupt.ff.JianShu.dao.IUserDao;
import com.xupt.ff.JianShu.domain.user;
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


    @Override
    public List<user> findAll() {
        List<user> userList = userDao.findAll();
        return userList;
    }

    @Override
    public List<user> findUserFollow(int userId) {
        return null;
    }
}
