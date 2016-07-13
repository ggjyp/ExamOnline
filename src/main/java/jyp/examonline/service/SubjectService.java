package jyp.examonline.service;

import java.util.List;
import jyp.examonline.entity.Subject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/7/8.
 */
public interface SubjectService {

    /**
     * 新增一个学科
     * @param subject
     * @return
     */
     int addSubject(Subject subject);

    /**
     * 删除一个学科
     * @param subjectId
     * @return
     */
    int deleteSubject(int subjectId);

    /**
     * 修改某一个学科
     * @param subject
     * @return
     */
    int modifySubject(Subject subject);

    /**
     * 根据当前页数、每页显示记录数
     * @param pageNumber
     * @param pageSize
     * @return
     */
    List<Subject> findSubjectByPage(int pageNumber, int pageSize);

    /**
     * 得到总记录数
     * @return
     */
    int countSubjectList();

}
