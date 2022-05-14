package com.PreciousTimeApp.PreciousTime.controller;

import com.PreciousTimeApp.PreciousTime.model.Answers;
import com.PreciousTimeApp.PreciousTime.repository.AnswersRepository;
import com.PreciousTimeApp.PreciousTime.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/crud")
// http://localhost:8081
@CrossOrigin(origins = "*",maxAge = 3600)
public class AnswersController {
    @Autowired
    AnswersRepository answersRepository;

    @Autowired
    AnswersService answersService;


    @PostMapping("/addAnswer")
    public String addAnswer(@RequestBody Answers answer){
        answersService.saveAnswerS(answer);
        return "New answer saved";
    }

    @GetMapping("/allAnswers")
    public List<Answers> showAllAnswers(){
        System.out.println("hello from all answers controller ");
        return answersService.getAllAnswersS();
    }


    @GetMapping("/answer/{id}")
    public Answers findAnswer(@PathVariable("id")Long id){
        return answersService.findAnswerByIdS(id);
    }


    @DeleteMapping("/deleteAnswer/{id}")
    private String deleteAnswer(@PathVariable("id")Long id){
        answersService.deleteAnswerS(id);
        return "Answer deleted!";
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
