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
    @Column(name = "user_id")
    private Long userId;

    // ska det vara tex @manyToOne?   kolla med lärare

    //can be null
    @Column(name = "question_id")
    private Long questionId;

    @NotNull
    @Column(name = "label")
    private String label;

    //can be null
    @Column(name = "time")
    private Long time;

    //can be null
    @Column(name = "comment")
    private String comment;

    @Column(name = "created_date")
    private String createdDate;

    public Answers() {
    }

    public Answers(Long id, Long userId, Long questionId, String label, Long time, String comment, String createdDate) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.label = label;
        this.time = time;
        this.comment = comment;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}