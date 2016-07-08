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
        int subjectId = 0;
        Subject subject = subjectDao.findById(subjectId);
        System.out.println(subject.toString());
    }

}
