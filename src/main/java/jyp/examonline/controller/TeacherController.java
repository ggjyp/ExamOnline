package jyp.examonline.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jyp.examonline.entity.Question;
import jyp.examonline.entity.QuestionSubject;
import jyp.examonline.service.QuestionService;
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

@Controller("teacherController")
@RequestMapping("/jsp/teacher")
public class TeacherController {
    // private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/question")
    public String page(){
        return "teacher/question";
    }

    //跳转至新增学科页面
    @RequestMapping(value = "/questionAdd",  produces = "text/plain;charset=UTF-8")
    public String addPage(){
        return "teacher/questionAdd";
    }

    //新增学科
    @RequestMapping(value = "/question/add", method = RequestMethod.POST)
    public String addQuestion(Question question){
        int result = questionService.addQuestion(question);
        if (result > 0)
            return "redirect:/jsp/teacher/question"; //   /jsp/admin/subject.jsp
        return null;
    }

    //跳转至编辑学科页面
    @RequestMapping(value = "/questionEdit", method = RequestMethod.GET ,produces = "text/plain;charset=UTF-8")
    public String editPage(HttpServletRequest request, Model model){
        String questionId = request.getParameter("questionId");
        model.addAttribute("questionId",questionId);
        return "teacher/questionEdit";
    }

    @RequestMapping(value = "/question/edit", method = RequestMethod.POST)
    public String editSubject(Question question){
        int result = questionService.modifyQuestion(question);
        if (result > 0)
            return "redirect:/jsp/teacher/question";
        return null;
    }

    //删除某学科
    @RequestMapping(value = "/questionDelete", method = RequestMethod.POST)
        public String subjectDelete (Question question  , HttpServletResponse response) throws
                                                                                  IOException {
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        int num = questionService.deleteQuestion(question.getSubjectId());
        boolean flag=false;
        if(num >0){
            flag=true;
        }
        //将数据转换成json
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("flag", flag);
        String json = JSONObject.valueToString(map);
        pw.print(json);
        return null;
    }

    //显示学科
    @RequestMapping(value="/questionList", method = RequestMethod.POST)
    public String subjectList(@RequestBody Page page, HttpServletResponse response) throws
                                                                                    IOException {
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        //页面大小
        int pageSize = page.getPageSize();
        //当前页码
        int pageNumber = (page.getPageNumber()-1)*pageSize;

        //根据当前页码和页面大小获取学科记录表
        List<QuestionSubject> questionList = questionService.findQuestionByPage(pageNumber, pageSize);
        //获取总记录数
        int total = questionService.countQuestionList();
        //将数据转换成json
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", total);
        map.put("rows", questionList);
        String json = JSONObject.valueToString(map);

        //返回JSON数据
        pw.print(json);
        return null;
    }
}
