package jyp.examonline.dao;

import java.util.List;
import jyp.examonline.entity.Subject;
import org.apache.ibatis.annotations.Param;

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
    void modifySubject(Subject subject);

    /**
     * 根据学科编号查找学科
     * @param subjectId
     * @return
     */
    Subject findById(int subjectId);

    /**
     * 根据当前页和页面大小来查询学科记录
     * @param pageNumber  当前页
     * @param pageSize  页面大小
     * @return
     */
    List<Subject> findSubjectByPage(@Param("pageNumber") int pageNumber, @Param("pageSize") int pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int countAllSubject();

}
