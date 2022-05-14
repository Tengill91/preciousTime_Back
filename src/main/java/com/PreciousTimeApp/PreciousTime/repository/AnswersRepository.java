package com.PreciousTimeApp.PreciousTime.repository;

import com.PreciousTimeApp.PreciousTime.model.Answers;
import com.PreciousTimeApp.PreciousTime.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswersRepository extends JpaRepository<Answers,Long> {


    @Query("SELECT u FROM Answers u WHERE u.user_id = :id")
    List<Answers> findAllAnswersByUserId(@Param("id") Long id);

}
