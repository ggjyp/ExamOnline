package jyp.examonline.service.impl;

import jyp.examonline.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jyp.examonline.entity.User;
import jyp.examonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/5.
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override public User login(String username, String pwd) {
        return userDao.findByPwd(username, pwd);
    }
}
