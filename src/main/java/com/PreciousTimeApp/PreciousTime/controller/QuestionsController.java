package com.PreciousTimeApp.PreciousTime.controller;

import com.PreciousTimeApp.PreciousTime.model.Labels;
import com.PreciousTimeApp.PreciousTime.model.Questions;
import com.PreciousTimeApp.PreciousTime.repository.LabelsRepository;
import com.PreciousTimeApp.PreciousTime.repository.QuestionsRepository;
import com.PreciousTimeApp.PreciousTime.service.LabelsService;
import com.PreciousTimeApp.PreciousTime.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crud")
// http://localhost:8081
@CrossOrigin(origins = "*",maxAge = 3600)
public class QuestionsController {
    @Autowired
    QuestionsRepository questionsRepository;

    @Autowired
    QuestionsService questionsService;


    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Questions question){
        questionsService.saveQuestionS(question);
        return "New question saved";
    }

    @GetMapping("/allQuestions")
    public List<Questions> showAllQuestions(){
        return questionsService.getAllQuestionsS();
    }


    @GetMapping("/question/{id}")
    public Questions findQuestion(@PathVariable("id")Long id){
        return questionsService.findQuestionByIdS(id);
    }


    @DeleteMapping("/deleteQuestion/{id}")
    private String deleteQuestion(@PathVariable("id")Long id){
        questionsService.deleteQuestionS(id);
        return "Question deleted!";
    }

    /*
    @PutMapping("/update/{id}")
    private ResponseEntity updateUser(@PathVariable("id") Long id, @RequestBody User user) {

        System.out.println("\n\n\n\n\n hejsan" + user);
        User currentUser = userRepository.findById(id).orElseThrow(RuntimeException::new);

        currentUser.setUsername(user.getUsername());
        currentUser.setEmail(user.getEmail());
        currentUser.setGreenpoints(user.getGreenpoints());
        userRepository.save(currentUser);

        return ResponseEntity.ok(currentUser);
    }
    */
}
