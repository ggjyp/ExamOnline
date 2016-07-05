package jyp.examonline.dao;

import jyp.examonline.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/7/5.
 */
public interface UserDao {

    /**
     * 通过用户id查找用户
     * @param userid
     * @return
     */
    User findById(int userid);

    User findByPwd(@Param("username") String username, @Param("pwd") String pwd);

}
