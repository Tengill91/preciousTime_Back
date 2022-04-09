package com.PreciousTimeApp.PreciousTime.service;

import com.PreciousTimeApp.PreciousTime.model.Labels;
import com.PreciousTimeApp.PreciousTime.repository.LabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelsService {

    @Autowired
    LabelsRepository labelsRepository;

    public List<Labels> getAllLabelsS(){

        List<Labels> labelsList = labelsRepository.findAll();

        return labelsList;
    }

    public Labels saveLabelS(Labels label){
        return labelsRepository.save(label);
    }

    public Labels findLabelByIdS(Long id){

        return labelsRepository.findById(id).get();
    }

    public void deleteLabelS(Long id){
        labelsRepository.deleteById(id);
    }

    public Labels updateLabelS (Labels label){
        labelsRepository.save(label);

        return label;
    }



}
