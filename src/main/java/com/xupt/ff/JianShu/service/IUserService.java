package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-1:52
 */
public interface IUserService {

    userInformation login(user loginUser);

    List<user> findUserFollow(int userId);

    int register(userInformation user);

    List<user> findUserFocus(int userId);
}
