package jyp.examonline.entity;

import java.util.Date;

/**
 * Created by jyp on 2016/7/6.
 */
public class Subject {
    private int subjectId;
    private String subjectName;
    private Date subjectCreateDate;
    private Date subjectDeleteDate;

    public Subject(){

    }


    public Subject(int subjectId, String subjectName, Date subjectCreateDate, Date subjectDeleteDate) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectCreateDate = subjectCreateDate;
        this.subjectDeleteDate = subjectDeleteDate;
    }


    public int getSubjectId() {
        return subjectId;
    }


    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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

    @Override public String toString() {
        return "Subject{" +
            "subjectId=" + subjectId +
            ", subjectName='" + subjectName + '\'' +
            ", subjectCreateDate=" + subjectCreateDate +
            ", subjectDeleteDate=" + subjectDeleteDate +
            '}';
    }
}
