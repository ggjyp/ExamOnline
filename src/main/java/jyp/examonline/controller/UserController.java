package jyp.examonline.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jyp.examonline.entity.Subject;
import jyp.examonline.entity.User;
import jyp.examonline.service.SubjectService;
import jyp.examonline.service.UserService;
import jyp.examonline.util.Page;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static jyp.examonline.util.StringValue.*;

/**
 * Created by jyp on 2016/7/6.
 */
@Controller("userController")
@RequestMapping("/jsp/user")// url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    //通用用户功能
    @RequestMapping("/login")
    public String login(User u) {
        User user = userService.login(u.getUserName(), u.getUserPwd());
        if ( user != null)
        {
            if (user.getUserStatus() == STATUS_STUDENT)
                return "/student/main";
            else if(user.getUserStatus() == STATUS_TEACHER)
                return "redirect:/jsp/teacher/question";
            else
            //否则进入管理员页面
                return "redirect:/jsp/admin/subject";
        }

        else
            return "/user/login";
    }

    @RequestMapping(value="/register/check_username",method = RequestMethod.POST)
    public String checkUserName(String userName, HttpServletResponse response) throws IOException {
        int num = userService.checkUserName(userName);
        boolean flag=false;
        if(num >0){
            flag=true;
        }
        //将数据转换成json
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("flag", flag);
        String json = JSONObject.valueToString(map);
        //将数据返回

        response.setCharacterEncoding("UTF-8");
        response.flushBuffer();
        response.getWriter().write(json);
        response.getWriter().flush();
        response.getWriter().close();
        return null;
    }

    @RequestMapping(value="/register/successed")
    public String  successed(User user) throws IOException{
        //新增用户插入数据库
        user.setUserStatus(1);
        userService.register(user);
        return "/user/login";
    }



}
