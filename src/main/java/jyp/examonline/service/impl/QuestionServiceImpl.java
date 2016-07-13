package jyp.examonline.service.impl;

import java.util.List;
import jyp.examonline.dao.QuestionDao;
import jyp.examonline.entity.Question;
import jyp.examonline.entity.QuestionSubject;
import jyp.examonline.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private QuestionDao questionDao;

    @Override public int addQuestion(Question question) {
        return questionDao.addQuestion(question);
    }


    @Override public int deleteQuestion(int questionId) {
        return questionDao.deleteQuestion(questionId);
    }


    @Override public int modifyQuestion(Question question) {
        return questionDao.modifyQuestion(question);
    }


    @Override public List<QuestionSubject> findQuestionByPage(int pageNumber, int pageSize) {
        return questionDao.findQuestionByPage(pageNumber,pageSize);
    }


    @Override public int countQuestionList() {
        return questionDao.countAllQuestion();
    }
}
