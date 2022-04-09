package com.PreciousTimeApp.PreciousTime.repository;

import com.PreciousTimeApp.PreciousTime.model.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import java.util.List;




    @Repository
    public interface LabelsRepository extends JpaRepository<Labels,Long> {

    }
