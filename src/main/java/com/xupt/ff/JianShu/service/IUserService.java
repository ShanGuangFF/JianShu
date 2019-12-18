package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.followers;
import com.xupt.ff.JianShu.domain.requestType.userRegister;
import com.xupt.ff.JianShu.domain.returnType.userInf;
import com.xupt.ff.JianShu.domain.returnType.userReturn;
import com.xupt.ff.JianShu.domain.user;
import com.xupt.ff.JianShu.domain.userInformation;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-1:52
 */
public interface IUserService {

    userReturn login(user loginUser);

    userReturn findUserFollow(int userId);

    userReturn register(userRegister userRegister);

    userReturn findUserFocus(int userId);

    boolean focus(int userId,int fanId);
}
