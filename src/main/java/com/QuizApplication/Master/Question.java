package com.QuizApplication.Master;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statement;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private String correctAns;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }


    public String getStatement() {
        return statement;
    }

    public void setOption1(String option1) {
        Option1 = option1;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption2(String option2) {
        Option2 = option2;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption3(String option3) {
        Option3 = option3;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption4(String option4) {
        Option4 = option4;
    }

    public String getOption4() {
        return Option4;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getCorrectAns() {
        return correctAns;
    }
}
