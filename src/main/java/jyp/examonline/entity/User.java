package jyp.examonline.entity;

import java.util.Date;

/**
 * Created by jyp on 2016/7/5.
 */
public class User {
    private int userId;
    private String userName;
    private String userPwd;
    //学号，学生角色特有，其他角色为空
    private String userNum;
    private int userStatus;
    private Date userCreatedate;
    private Date userDeletedate;
    private String userPhone;
    private String userEmail;

    public User(){

    }

    public User(int userId, String userName, String userPwd, String userNum, int userStatus, Date userCreatedate, Date userDeletedate, String userPhone, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userNum = userNum;
        this.userStatus = userStatus;
        this.userCreatedate = userCreatedate;
        this.userDeletedate = userDeletedate;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }


    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPwd() {
        return userPwd;
    }


    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    public String getUserNum() {
        return userNum;
    }


    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }


    public int getUserStatus() {
        return userStatus;
    }


    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }


    public Date getUserCreatedate() {
        return userCreatedate;
    }


    public void setUserCreatedate(Date userCreatedate) {
        this.userCreatedate = userCreatedate;
    }


    public Date getUserDeletedate() {
        return userDeletedate;
    }


    public void setUserDeletedate(Date userDeletedate) {
        this.userDeletedate = userDeletedate;
    }


    public String getUserPhone() {
        return userPhone;
    }


    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }


    public String getUserEmail() {
        return userEmail;
    }


    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    @Override public String toString() {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userPwd='" + userPwd + '\'' +
            ", userNum='" + userNum + '\'' +
            ", userStatus=" + userStatus +
            ", userCreatedate=" + userCreatedate +
            ", userDeletedate=" + userDeletedate +
            ", userPhone='" + userPhone + '\'' +
            ", userEmail='" + userEmail + '\'' +
            '}';
    }
}
