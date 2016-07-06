import jyp.examonline.entity.User;
import jyp.examonline.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/7/6.
 */
public class ServiceTest extends BaseTest {
    @Autowired
    UserService userService;

    @Test
    public void testLogin(){
        User user = userService.login("jyp","123456");
        // if (user != null) {
        //     System.out.println("success");
        // } else {
        //     System.out.println("fail");
        // }
        System.out.println(user.toString());
    }

}
