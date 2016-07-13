package service;

import jyp.examonline.entity.Subject;
import jyp.examonline.entity.User;
import jyp.examonline.service.SubjectService;
import jyp.examonline.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/7/6.
 */
public class SubjectServiceTest extends BaseTest {
    @Autowired
    SubjectService subjectService;

    @Test
    public void testDelete(){
        System.out.println(subjectService.deleteSubject(16));
    }

    @Test
    public void testModify(){
        Subject subject = new Subject();
        subject.setSubjectId(8);
        subject.setSubjectName("修改功能测试");
        System.out.println(subjectService.modifySubject(subject));
    }

}
