package jyp.examonline.controller;

import jyp.examonline.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jyp on 2016/7/6.
 */
@Controller("userController")
@RequestMapping("/jsp/user")// url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String name, String pwd) {
        if (userService.login(name, pwd) != null)
            return "user/success";
        else
            return "user/login";
    }


}
