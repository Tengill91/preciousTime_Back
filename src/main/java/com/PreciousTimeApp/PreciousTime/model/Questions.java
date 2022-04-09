package com.PreciousTimeApp.PreciousTime.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question")
    @Size(max = 100)
    private String question;

    @Column(name = "comment")
    @Size(max = 100)
    private String comment;

    @Column(name = "time")
    @Size(max = 100)
    private Integer time;

    public Questions() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}