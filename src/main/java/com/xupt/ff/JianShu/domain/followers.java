package com.xupt.ff.JianShu.domain;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/10-17:43
 */
public class followers {
    private int followerId;
    private int userId;
    private int fanId;
    private int flag = 0;

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFanId() {
        return fanId;
    }

    public void setFanId(int fanId) {
        this.fanId = fanId;
    }

    public int isFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "followers{" +
                "followerId=" + followerId +
                ", userId=" + userId +
                ", fanId=" + fanId +
                ", flag=" + flag +
                '}';
    }
}
