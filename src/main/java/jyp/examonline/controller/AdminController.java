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
import jyp.examonline.service.SubjectService;
import jyp.examonline.service.UserService;
import jyp.examonline.util.Page;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/7/11.
 */
@Controller("adminController")
@RequestMapping("/jsp/admin")// url:/模块/资源/{id}/细分 /seckill/list
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SubjectService subjectService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/subject")
    public String Page(){
        return "admin/subject";
    }


    //跳转至新增学科页面
    @RequestMapping(value = "/subjectAdd",  produces = "text/plain;charset=UTF-8")
    public String addPage(){
        return "admin/subjectAdd";
    }

    //新增学科
    @RequestMapping(value = "/subject/add", method = RequestMethod.POST)
    public String addSubject(Subject subject){
        int result = subjectService.addSubject(subject);
        if (result > 0)
            return "redirect:/jsp/admin/subject"; //   /jsp/admin/subject.jsp
        return null;
    }

    //跳转至编辑学科页面
    @RequestMapping(value = "/subjectEdit", method = RequestMethod.GET ,produces = "text/plain;charset=UTF-8")
    public String editPage(HttpServletRequest request, Model model){
        String subjectId = request.getParameter("subjectId");
        model.addAttribute("subjectId",subjectId);
        System.out.println(subjectId);
        return "admin/subjectEdit";
    }

    @RequestMapping(value = "/subject/edit", method = RequestMethod.POST)
    public String editSubject(Subject subject){
        System.out.println("subjectId="+subject.getSubjectId()+"subjectName="+subject.getSubjectName());
        int result = subjectService.modifySubject(subject);
        if (result > 0)
            return "redirect:/jsp/admin/subject"; //   /jsp/admin/subject.jsp
        return null;
    }

    //删除某学科
        @RequestMapping(value = "/subjectDelete", method = RequestMethod.POST)
    public String subjectDelete (Subject subject  , HttpServletResponse response) throws IOException {
            response.setCharacterEncoding("utf-8");
            PrintWriter pw = response.getWriter();
            // JSONObject object =new JSONObject(jsonStr);
            int num = subjectService.deleteSubject(subject.getSubjectId());
            boolean flag=false;
            if(num >0){
                flag=true;
            }
            //将数据转换成json
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("flag", flag);
            String json = JSONObject.valueToString(map);
            //将数据返回

            pw.print(json);
            return null;
    }



    //显示学科
    @RequestMapping(value="/subjectList", method = RequestMethod.POST)
    public String subjectList(@RequestBody Page page, HttpServletResponse response) throws
                                                                                    IOException {
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        //页面大小
        int pageSize = page.getPageSize();
        //当前页码
        int pageNumber = (page.getPageNumber()-1)*pageSize;

        //根据当前页码和页面大小获取学科记录表
        List<Subject> subjectList = subjectService.findSubjectByPage(pageNumber, pageSize);
        //获取总记录数
        int total = subjectService.countSubjectList();
        //将数据转换成json
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", total);
        map.put("rows", subjectList);
        String json = JSONObject.valueToString(map);

        //返回JSON数据
        pw.print(json);
        return null;
    }





}
