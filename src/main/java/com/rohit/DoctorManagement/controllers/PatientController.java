package com.rohit.DoctorManagement.controllers;

import com.rohit.DoctorManagement.dtos.PatientDto;
import com.rohit.DoctorManagement.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping
    ResponseEntity<PatientDto> addNewPatient(@RequestBody PatientDto patientDto)
    {
        return new ResponseEntity<>(patientService.addNewPatient(patientDto), HttpStatus.CREATED);
    }


    @DeleteMapping("/{patientId}")
    ResponseEntity<String> removePatient(@PathVariable Integer patientId)
    {
        patientService.removePatient(patientId);
        return new ResponseEntity<>("Patient Removed Successfully ",HttpStatus.OK);
    }




}
