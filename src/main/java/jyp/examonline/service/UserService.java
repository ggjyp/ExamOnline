package jyp.examonline.service;

import jyp.examonline.entity.User;

/**
 * Created by Administrator on 2016/7/5.
 */
public interface UserService {

    /**
     * 通过用户名密码登陆
     * @param username
     * @param pwd
     * @return
     */
    User login(String username, String pwd);

}
