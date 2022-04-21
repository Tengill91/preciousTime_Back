package com.PreciousTimeApp.PreciousTime.repository;

import com.PreciousTimeApp.PreciousTime.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<Answers,Long> {
}
