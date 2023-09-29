package com.rohit.DoctorManagement.services;


import com.rohit.DoctorManagement.dtos.SpecialitySymptomDto;

import com.rohit.DoctorManagement.entities.SpecialitySymptom;
import com.rohit.DoctorManagement.repositories.SpecialitySymptomRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialitySymptomService {
    @Autowired
    SpecialitySymptomRepository specialitySymptomRepository;
    ModelMapper modelMapper=new ModelMapper();




    public  SpecialitySymptomDto addSpeciality(SpecialitySymptomDto specialitySymptomDto)
    {
        SpecialitySymptom newSpeciality=modelMapper.map(specialitySymptomDto, SpecialitySymptom.class);


        SpecialitySymptom saved=specialitySymptomRepository.save(newSpeciality);
        return modelMapper.map(saved,SpecialitySymptomDto.class);

    }


    public void removeSpeciality(Integer specialityId)
    {
        SpecialitySymptom speciality=specialitySymptomRepository.findById(specialityId).orElseThrow(()->new RuntimeException("There is no speciality with this id"));
        specialitySymptomRepository.deleteById(specialityId);
    }



}
