package jyp.examonline.service;

import java.util.List;
import jyp.examonline.entity.Question;
import jyp.examonline.entity.QuestionSubject;

/**
 * Created by Administrator on 2016/7/13.
 */
public interface QuestionService {
    int addQuestion(Question question);
    int deleteQuestion(int questionId);
    int modifyQuestion(Question question);
    List<QuestionSubject> findQuestionByPage(int pageNumber, int pageSize);
    int countQuestionList();
}
