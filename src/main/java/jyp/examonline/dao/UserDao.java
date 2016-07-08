package jyp.examonline.dao;

import jyp.examonline.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/7/5.
 */
public interface UserDao {

    /**
     * 通过用户id查找用户
     * @param userId
     * @return
     */
    User findById(int userId);

    /**
     * 通过用户名密码查找用户
     * @param username
     * @param pwd
     * @return
     */
    User findByPwd(@Param("userName") String username, @Param("userPwd") String pwd);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    int findByUserName(String userName);


    /**
     * 增加用户
     * @param user 用户实例
     * @return 成功操作的记录数目
     */
    int addUser(User user);
}
