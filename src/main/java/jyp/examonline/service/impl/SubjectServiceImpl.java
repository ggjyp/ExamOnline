package jyp.examonline.service.impl;

import java.util.List;
import jyp.examonline.dao.SubjectDao;
import jyp.examonline.entity.Subject;
import jyp.examonline.service.SubjectService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/9.
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SubjectDao subjectDao;
    //
    @Override public int addSubject(Subject subject) {
        return subjectDao.addSubject(subject);
    }


    @Override public int deleteSubject(int subjectId) {
        return subjectDao.deleteSubject(subjectId);
    }


    @Override public int modifySubject(Subject subject) {
        return subjectDao.modifySubject(subject);
    }


    @Override public List<Subject> findSubjectByPage(int pageNumber, int pageSize) {
        return subjectDao.findSubjectByPage(pageNumber, pageSize);
    }


    @Override public int countSubjectList() {
        return subjectDao.countAllSubject();
    }
}
