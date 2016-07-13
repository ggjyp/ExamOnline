package dao;

import javax.annotation.Resource;
import jyp.examonline.dao.SubjectDao;
import jyp.examonline.entity.Subject;
import org.junit.Test;

/**
 * Created by Administrator on 2016/7/6.
 */
public class SubjectDaoTest extends BaseTest {
    @Resource
    SubjectDao subjectDao;

    @Test
    public void findByIdTest(){
        int subjectId = 4;
        Subject subject = subjectDao.findById(subjectId);
        System.out.println(subject.toString());
    }

    @Test
    public void testInsert(){
        Subject subject = new Subject();
        subject.setSubjectName("软件工程");

        System.out.println(subjectDao.addSubject(subject));
    }

    @Test
    public void testUpdate(){
        Subject subject = subjectDao.findById(1);
        subject.setSubjectName("测试学科");
        subjectDao.modifySubject(subject);
    }

    @Test
    public void testDelete(){
        subjectDao.deleteSubject(1);
    }
}
