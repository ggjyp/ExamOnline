package dao;

import javax.annotation.Resource;
import jyp.examonline.dao.UserDao;
import jyp.examonline.entity.User;
import org.junit.Test;

public class UserDaoTest extends BaseTest {
    @Resource
    private UserDao userDao;

    @Test
        public void testFindByUserName() throws  Exception
    {
        String userName = "jyp";
        System.out.println(userDao.findByUserName(userName));
    }


    @Test
    public void testFindById() throws Exception {
        int userId = 1;
        User user = userDao.findById(userId);
        System.out.println(user.toString());
    }

    @Test
    public void testUserFindByPwd() throws Exception{
        String userName = "jyp";
        String userPwd = "123456";
        User user = userDao.findByPwd(userName, userPwd);
        System.out.println(user.toString());
    }

    @Test
    public void testAddUser() throws  Exception{
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

        if (userDao.addUser(user) == 1) {
            System.out.println("insert success");
        } else {
            System.out.println("failed");
        }

    }
}
