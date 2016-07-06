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

    User findByPwd(@Param("userName") String username, @Param("userPwd") String pwd);

}
