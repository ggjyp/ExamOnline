package jyp.examonline.entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Question {
    private int questionId;
    private int questionDifficulty;
    private Subject subject;
    private int questionScore;
    private String questionBody;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String imgUrl;
    private String answer;
    private Date questionCreateDate;
    private Date questionDeleteDate;
    private int subjectId;

    public Question(){

    }

    public int getQuestionId() {
        return questionId;
    }


    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }


    public int getQuestionDifficulty() {
        return questionDifficulty;
    }


    public void setQuestionDifficulty(int questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }


    public Subject getSubject() {
        return subject;
    }


    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public int getQuestionScore() {
        return questionScore;
    }


    public void setQuestionScore(int questionScore) {
        this.questionScore = questionScore;
    }


    public String getQuestionBody() {
        return questionBody;
    }


    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }


    public String getOptionA() {
        return optionA;
    }


    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }


    public String getOptionB() {
        return optionB;
    }


    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }


    public String getOptionC() {
        return optionC;
    }


    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }


    public String getOptionD() {
        return optionD;
    }


    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public String getAnswer() {
        return answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public Date getQuestionCreateDate() {
        return questionCreateDate;
    }


    public void setQuestionCreateDate(Date questionCreateDate) {
        this.questionCreateDate = questionCreateDate;
    }


    public Date getQuestionDeleteDate() {
        return questionDeleteDate;
    }


    public void setQuestionDeleteDate(Date questionDeleteDate) {
        this.questionDeleteDate = questionDeleteDate;
    }


    public int getSubjectId() {
        return subjectId;
    }


    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
