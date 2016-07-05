import java.awt.print.Book;
import jyp.examonline.dao.UserDao;
import jyp.examonline.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/7/5.
 */
public class DaoTest extends BaseTest{
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindById() throws Exception {
        int userId = 1;
        User user = userDao.findById(userId);
        System.out.println(user);
    }

    @Test
    public void testUserFindByPwd() throws Exception{
        String userName = "jyp";
        String userPwd = "123456";
        User user = userDao.findByPwd(userName, userPwd);
        System.out.println("success!");

    }
}
