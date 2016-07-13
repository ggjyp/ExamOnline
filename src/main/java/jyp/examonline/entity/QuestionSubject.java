package jyp.examonline.entity;

import java.util.Date;

/**
 * Question的拓展类，通过此类映射Question和Subject的查询结果，让此类继承字段较多的实体类
 */
public class QuestionSubject extends Question{
    private String subjectName;
    private Date subjectCreateDate;
    private Date subjectDeleteDate;

    public QuestionSubject(){

    }

    public String getSubjectName() {
        return subjectName;
    }


    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public Date getSubjectCreateDate() {
        return subjectCreateDate;
    }


    public void setSubjectCreateDate(Date subjectCreateDate) {
        this.subjectCreateDate = subjectCreateDate;
    }


    public Date getSubjectDeleteDate() {
        return subjectDeleteDate;
    }


    public void setSubjectDeleteDate(Date subjectDeleteDate) {
        this.subjectDeleteDate = subjectDeleteDate;
    }
}
