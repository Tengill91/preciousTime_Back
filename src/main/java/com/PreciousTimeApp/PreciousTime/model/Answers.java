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
    @NotNull
    @Column(name = "question_id")
    private Long questionId;

    @NotNull
    @Column(name = "label_id")
    private Long label_id;

    @NotNull
    @Column(name = "time")
    private String time;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_date")
    private String createdDate;

    public Answers() {
    }

    public Answers(Long id, Long userId, Long questionId, Long label_id, String time, String comment, String createdDate) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.label_id = label_id;
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

    public Long getLabel_id() {
        return label_id;
    }

    public void setLabel_id(Long label_id) {
        this.label_id = label_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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