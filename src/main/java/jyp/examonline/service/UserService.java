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

    /**
     *注册用户
     * @param user 用户实体
     * @return 成功返回1，失败返回0
     */
    int register(User user);

    /**
     * 检验用户名是否被占用
     * @param userName 用户名
     * @return
     */
    int checkUserName(String userName);
}
