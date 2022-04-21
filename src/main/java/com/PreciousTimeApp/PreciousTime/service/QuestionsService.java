package com.PreciousTimeApp.PreciousTime.service;

import com.PreciousTimeApp.PreciousTime.model.Questions;
import com.PreciousTimeApp.PreciousTime.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {
    @Autowired
    QuestionsRepository questionsRepository;

    public List<Questions> getAllQuestionsS(){

        List<Questions> questionsList = questionsRepository.findAll();

        return questionsList;
    }

    public Questions saveQuestionS(Questions question){
        return questionsRepository.save(question);
    }

    public Questions findQuestionByIdS(Long id){

        return questionsRepository.findById(id).get();
    }

    public void deleteQuestionS(Long id){
        questionsRepository.deleteById(id);
    }

    public Questions updateQuestionS (Questions question){
        questionsRepository.save(question);

        return question;
    }
}
