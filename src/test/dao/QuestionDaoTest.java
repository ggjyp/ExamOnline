package dao;

import javax.annotation.Resource;
import jyp.examonline.dao.QuestionDao;
import jyp.examonline.dao.SubjectDao;
import jyp.examonline.entity.Question;
import jyp.examonline.entity.Subject;
import org.junit.Test;


public class QuestionDaoTest extends BaseTest {
    @Resource
    QuestionDao questionDao;

    @Test
    public void findByIdTest(){
        Question question = questionDao.findQuestionById(4);
        System.out.println(question.toString());
    }

    @Test
    public void add(){
        Question question = questionDao.findQuestionById(4);
        question.setSubjectId(question.getSubject().getSubjectId());
        question.setQuestionBody("这是一道送分题:22");
        int num = questionDao.addQuestion(question);
        System.out.println(num);
    }

    @Test
    public void modify(){
        Question question = questionDao.findQuestionById(24);
        question.setSubjectId(question.getSubject().getSubjectId());
        question.setQuestionBody("这是一道送分题：22");
        int num = questionDao.modifyQuestion(question);
        System.out.println(num);
    }

    @Test
    public void delete(){
        int num = questionDao.deleteQuestion(25);
        System.out.println(num);
    }



}
