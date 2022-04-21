package com.PreciousTimeApp.PreciousTime.service;

import com.PreciousTimeApp.PreciousTime.model.Answers;
import com.PreciousTimeApp.PreciousTime.repository.AnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswersService {
    @Autowired
    AnswersRepository answersRepository;

    public List<Answers> getAllAnswersS(){

        List<Answers> answersList = answersRepository.findAll();

        return answersList;
    }

    public Answers saveAnswerS(Answers answer){
        return answersRepository.save(answer);
    }

    public Answers findAnswerByIdS(Long id){

        return answersRepository.findById(id).get();
    }

    public void deleteAnswerS(Long id){
        answersRepository.deleteById(id);
    }

    public Answers updateAnswerS (Answers answer){
        answersRepository.save(answer);

        return answer;
    }
}
