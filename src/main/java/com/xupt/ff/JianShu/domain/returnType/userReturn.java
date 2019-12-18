package com.xupt.ff.JianShu.domain.returnType;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/18-13:52
 */
public class userReturn {

    private boolean flag;
    private List<?> userList;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<?> getUserList() {
        return userList;
    }

    public void setUserList(List<?> userList) {
        this.userList = userList;
    }
}
