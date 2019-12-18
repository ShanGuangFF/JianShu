package com.xupt.ff.JianShu.domain.returnType;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/17-18:25
 */
public class userInf {

    private int userId;
    private String name;
    private String sex;
    private String phoneNumber;
    private String email;
    private String userPassword;
    private String userImg;


    public userInf() {
    }



    public userInf(int userId, String name, String sex, String phoneNumber, String email, String userPassword) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userPassword = userPassword;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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
        return "userInf{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword +
                '}';
    }
}
