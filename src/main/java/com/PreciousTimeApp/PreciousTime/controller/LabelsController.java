package com.PreciousTimeApp.PreciousTime.controller;


import com.PreciousTimeApp.PreciousTime.model.Labels;
import com.PreciousTimeApp.PreciousTime.repository.LabelsRepository;
import com.PreciousTimeApp.PreciousTime.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crud")
// http://localhost:8081
@CrossOrigin(origins = "*",maxAge = 3600)
public class LabelsController {

    @Autowired
    LabelsRepository labelsRepository;

    @Autowired
    LabelsService labelsService;


    @PostMapping("/addLabel")
    public String add(@RequestBody Labels label){
        labelsService.saveLabelS(label);
        return "New user saved";
    }

    @GetMapping("/allLabels")
    public List<Labels> showAllUsers(){
        return labelsService.getAllLabelsS();
    }


    @GetMapping("/label/{id}")
    public Labels findLabel(@PathVariable("id")Long id){
        return labelsService.findLabelByIdS(id);
    }


    @DeleteMapping("/deleteLabel/{id}")
    private String deleteUser(@PathVariable("id")Long id){
        labelsService.deleteLabelS(id);
        return "User deleted!";
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
