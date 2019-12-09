package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.user;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-11-2019/11/28-1:52
 */
public interface IUserService {

    /**
     * @action 查询所用用户集合
     * @return
     */
    public List<user> findAll();

    public List<user> findUserFollow(int userId);
}
