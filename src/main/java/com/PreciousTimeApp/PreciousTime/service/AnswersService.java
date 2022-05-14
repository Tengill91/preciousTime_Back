package com.PreciousTimeApp.PreciousTime.service;

import com.PreciousTimeApp.PreciousTime.model.Answers;
import com.PreciousTimeApp.PreciousTime.model.User;
import com.PreciousTimeApp.PreciousTime.repository.AnswersRepository;
import com.PreciousTimeApp.PreciousTime.springSecurity.SecurityServices.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswersService {


    @Autowired
    AnswersRepository answersRepository;

    public List<Answers> getAllAnswersS(){
        UserDetailsImpl loggedInUser = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Long loggedInUserId = loggedInUser.getId();

        // måste nog göra en egen query för att hitta user_id istället för answer_id
        List<Answers> answersList = answersRepository.findAllAnswersByUserId(loggedInUserId);
        System.out.println(answersList);

        return answersList;
    }

    public Answers saveAnswerS(Answers answer){
        return answersRepository.save(new Answers(answer.getUser_id(),answer.getQuestion_Id(), answer.getLabel(),answer.getTime(),answer.getComment(),answer.getCreated_date()));
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
