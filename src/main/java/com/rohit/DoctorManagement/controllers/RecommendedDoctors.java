package com.rohit.DoctorManagement.controllers;

import com.rohit.DoctorManagement.dtos.DoctorDto;
import com.rohit.DoctorManagement.services.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suggestedDoctors")
public class RecommendedDoctors {

    @Autowired
    PatientService patientService;
    @GetMapping
    ResponseEntity<List<DoctorDto>> suggestedDoctors(@RequestParam("patientId") Integer patientId)
    {
      return new ResponseEntity<>(patientService.getAllMatchingDoctors(patientId), HttpStatus.OK) ;
    }
}

