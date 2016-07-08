package service;

import jyp.examonline.entity.User;
import jyp.examonline.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/7/6.
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    UserService userService;

    @Test
    public void testLogin(){
        User user = userService.login("jyp","123456");
        System.out.println(user.toString());
    }

    @Test
    public void testReg(){
        String username = "name_test";
        String pwd = "123456";
        String num = "313113";
        int status = 1;
        String phone = "132456123456";
        String email ="45000049@qq.com";
        User user = new User();
        user.setUserName(username);
        user.setUserPwd(pwd);
        user.setUserNum(num);
        user.setUserStatus(status);
        user.setUserPhone(phone);
        user.setUserEmail(email);

        System.out.println(userService.register(user));
    }

    @Test
    public void testCheckUserName(){
        String userName = "aaa";
        System.out.println(userService.checkUserName(userName));
    }

}
