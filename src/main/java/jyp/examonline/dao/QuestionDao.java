package jyp.examonline.dao;

import java.util.List;
import jyp.examonline.entity.Question;
import jyp.examonline.entity.QuestionSubject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/7/13.
 */
public interface QuestionDao {
    /**
     * 根据试题ID查询试题实体
     * @param questionId
     * @return
     */
    Question findQuestionById(int questionId);

    int addQuestion(Question question);

    int modifyQuestion(Question question);

    int deleteQuestion(int questionId);

    List<QuestionSubject> findQuestionByPage(@Param("pageNumber") int pageNumber, @Param("pageSize") int pageSize);

    int countAllQuestion();
}
