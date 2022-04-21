package com.PreciousTimeApp.PreciousTime.repository;

import com.PreciousTimeApp.PreciousTime.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Long> {

}
