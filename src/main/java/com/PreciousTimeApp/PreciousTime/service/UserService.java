package com.PreciousTimeApp.PreciousTime.service;


import com.PreciousTimeApp.PreciousTime.model.Labels;
import com.PreciousTimeApp.PreciousTime.model.User;
import com.PreciousTimeApp.PreciousTime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User updateUserS (User user){
        userRepository.save(user);

        return user;
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
