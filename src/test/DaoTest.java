import javax.annotation.Resource;
import jyp.examonline.dao.UserDao;
import jyp.examonline.entity.User;
import org.junit.Test;

public class DaoTest extends BaseTest{
    @Resource
    private UserDao userDao;

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
}
