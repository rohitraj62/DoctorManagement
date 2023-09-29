package com.rohit.DoctorManagement.controllers;


import com.rohit.DoctorManagement.dtos.SpecialitySymptomDto;
import com.rohit.DoctorManagement.services.SpecialitySymptomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/symptom")
public class SpecialitySymptomController {
    @Autowired
    SpecialitySymptomService specialitySymptomService;
    @PostMapping("")
    ResponseEntity<SpecialitySymptomDto> createSpeciality( @RequestBody SpecialitySymptomDto specialitySymptomDto)
    {
        return new ResponseEntity<>(specialitySymptomService.addSpeciality(specialitySymptomDto), HttpStatus.CREATED);
    }



    @DeleteMapping("/{specialityId}")
    ResponseEntity<String> removeSpeciality(@PathVariable Integer specialityId)
    {
        specialitySymptomService.removeSpeciality(specialityId);
        return new ResponseEntity<>("Speciality with given ID is successfully Removed",HttpStatus.OK);
    }

}
