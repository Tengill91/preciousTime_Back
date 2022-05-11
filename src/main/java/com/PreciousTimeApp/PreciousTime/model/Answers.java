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
    private Long user_id;

    // ska det vara tex @manyToOne?   kolla med lärare

    //can be null
    @Column(name = "question_id")
    private Long question_Id;

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
    private String created_date;

    public Answers() {
    }

    public Answers(Long user_id, Long question_Id, String label, Long time, String comment, String created_date) {
        this.user_id = user_id;
        this.question_Id = question_Id;
        this.label = label;
        this.time = time;
        this.comment = comment;
        this.created_date = created_date;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getQuestion_Id() {
        return question_Id;
    }

    public void setQuestion_Id(Long question_Id) {
        this.question_Id = question_Id;
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

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}