package com.xupt.ff.JianShu.domain.requestType;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/17-18:06
 */
public class userRegister {

    private String name;//昵称
    private String sex;//性别
    private String phoneNumber;//电话号同账号
    private String email;//邮箱
    private String userPassword;//密码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "userRegister{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
