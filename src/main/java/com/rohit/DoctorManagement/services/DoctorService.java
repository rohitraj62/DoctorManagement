package com.rohit.DoctorManagement.services;

import com.rohit.DoctorManagement.dtos.DoctorDto;
import com.rohit.DoctorManagement.entities.Doctor;
import com.rohit.DoctorManagement.repositories.DoctorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    ModelMapper modelMapper=new ModelMapper();

   public DoctorDto  addNewDoctor(DoctorDto doctorDto)
    {
        Doctor savedDoctor=modelMapper.map(doctorDto, Doctor.class);
        Doctor newDoctor=doctorRepository.save(savedDoctor);
        return modelMapper.map(newDoctor,DoctorDto.class);
    }

  public void deleteDoctor(Integer doctorId)
   {
      Doctor doctor= doctorRepository.findById(doctorId).orElseThrow(()->new RuntimeException("Doctor Not Found With This ID Please try with Valid ID"));
      doctorRepository.delete(doctor);
    }




}
