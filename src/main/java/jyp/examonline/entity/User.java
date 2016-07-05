package jyp.examonline.entity;

import java.util.Date;

/**
 * Created by jyp on 2016/7/5.
 */
public class User {
    private int user_id;
    private String user_name;
    private String user_pwd;
    //学号，学生角色特有，其他角色为空
    private String user_num;
    private int user_status;
    private Date user_createdate;
    private Date user_deletedate;
    private String user_phone;
    private String user_email;

    public User(){

    }

    public User(int user_id, String user_name, String user_pwd, String user_num, int user_status, Date user_createdate, Date user_deletedate, String user_phone, String user_email) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_num = user_num;
        this.user_status = user_status;
        this.user_createdate = user_createdate;
        this.user_deletedate = user_deletedate;
        this.user_phone = user_phone;
        this.user_email = user_email;
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getUser_name() {
        return user_name;
    }


    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public String getUser_pwd() {
        return user_pwd;
    }


    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }


    public String getUser_num() {
        return user_num;
    }


    public void setUser_num(String user_num) {
        this.user_num = user_num;
    }


    public int getUser_status() {
        return user_status;
    }


    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }


    public Date getUser_createdate() {
        return user_createdate;
    }


    public void setUser_createdate(Date user_createdate) {
        this.user_createdate = user_createdate;
    }


    public Date getUser_deletedate() {
        return user_deletedate;
    }


    public void setUser_deletedate(Date user_deletedate) {
        this.user_deletedate = user_deletedate;
    }


    public String getUser_phone() {
        return user_phone;
    }


    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }


    public String getUser_email() {
        return user_email;
    }


    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }


    @Override public String toString() {
        return "User{" +
            "user_id=" + user_id +
            ", user_name='" + user_name + '\'' +
            ", user_pwd='" + user_pwd + '\'' +
            ", user_num='" + user_num + '\'' +
            ", user_status=" + user_status +
            ", user_createdate=" + user_createdate +
            ", user_deletedate=" + user_deletedate +
            ", user_phone='" + user_phone + '\'' +
            ", user_email='" + user_email + '\'' +
            '}';
    }
}
