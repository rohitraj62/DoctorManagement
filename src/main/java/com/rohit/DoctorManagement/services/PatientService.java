package com.rohit.DoctorManagement.services;


import com.rohit.DoctorManagement.dtos.DoctorDto;
import com.rohit.DoctorManagement.dtos.PatientDto;
import com.rohit.DoctorManagement.entities.Doctor;
import com.rohit.DoctorManagement.entities.Patient;
import com.rohit.DoctorManagement.entities.SpecialitySymptom;
import com.rohit.DoctorManagement.repositories.DoctorRepository;
import com.rohit.DoctorManagement.repositories.PatientRepository;
import com.rohit.DoctorManagement.repositories.SpecialitySymptomRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    SpecialitySymptomRepository specialitySymptomRepository;


    @Autowired
    DoctorRepository doctorRepository;


    ModelMapper modelMapper=new ModelMapper();



    public PatientDto addNewPatient(PatientDto patientDto)
    {
            Patient newPatient = modelMapper.map(patientDto, Patient.class);
            Patient savedPatient = patientRepository.save(newPatient);
            return modelMapper.map(savedPatient, PatientDto.class);

    }

    public void removePatient(Integer patientId) {
        Patient patient=patientRepository.findById(patientId).orElseThrow(()->new RuntimeException("No Patient Found With this Id"));
        patientRepository.delete(patient);
    }



    public List<DoctorDto> getAllMatchingDoctors(Integer patientId)
    {
        Patient patient=patientRepository.findById(patientId).orElseThrow(()->new RuntimeException("No Patient available with this id"));
        String cityOfPatient=patient.getPatientCity();
        String symptomOfPatient=patient.getPatientSymptom();


        SpecialitySymptom specialitySymptom=specialitySymptomRepository.findBySymptom(symptomOfPatient);
        String speciality=specialitySymptom.getSpeciality();



        List<Doctor> doctorsBySpecialtyAndCity = doctorRepository.findAllByDoctorSpecialityAndDoctorCity(speciality, cityOfPatient);
        List<DoctorDto> dtoList = doctorsBySpecialtyAndCity.stream()
                .map(doctor -> modelMapper.map(doctor, DoctorDto.class))
                .collect(Collectors.toList());
        return dtoList;
    }

}
