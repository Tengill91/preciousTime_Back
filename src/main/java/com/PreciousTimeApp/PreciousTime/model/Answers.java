package com.PreciousTimeApp.PreciousTime.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "answers")
public class Answers {

    // du måste nog göra om bridge tablet

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;

    // ska det vara tex @manyToOne?   kolla med lärare
    @NotNull
    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    Questions questions;

    @NotNull
    @Column(name = "time")
    private String time;

    @Column(name = "comment")
    private String answer;

    @Column(name = "created_date")
    private String createdDate;

    public Answers() {
    }

    public Answers(User user, Questions questions, String time, String answer, String createdDate) {
        this.user = user;
        this.questions = questions;
        this.time = time;
        this.answer = answer;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
