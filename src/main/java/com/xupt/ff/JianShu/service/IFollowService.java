package com.xupt.ff.JianShu.service;

import com.xupt.ff.JianShu.domain.userInformation;


import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-21:58
 */

public interface IFollowService {


    List<userInformation> followerInf(int userId);

    List<userInformation> focusInf(int userId);
}
