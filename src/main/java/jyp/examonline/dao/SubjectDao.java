package jyp.examonline.dao;

import jyp.examonline.entity.Subject;

/**
 * Created by jyp on 2016/7/6.
 */
public interface SubjectDao {

    /**
     * 增加学科
     * @param subject 学科实体
     * @return增加的数量
     */
    int addSubject(Subject subject);

    /**
     * 根据学科编号删除学科
     * @param subjectId
     * @return
     */
    int deleteSubject(int subjectId);

    /**
     * 修改学科信息
     * @param subject
     * @return
     */
    int modifySubject(Subject subject);

    /**
     * 根据学科编号查找学科
     * @param subjectId
     * @return
     */
    Subject findById(int subjectId);


}
