package com.rohit.DoctorManagement.controllers;

import com.rohit.DoctorManagement.dtos.DoctorDto;
import com.rohit.DoctorManagement.services.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/new")
    ResponseEntity<DoctorDto> createDoctor(@Valid @RequestBody DoctorDto doctorDto)
    {
        return new ResponseEntity<>(doctorService.addNewDoctor(doctorDto), HttpStatus.CREATED);
    }
    @DeleteMapping("/{doctorId}")
    ResponseEntity<String> removeDoctor(@PathVariable Integer doctorId)
    {
        doctorService.deleteDoctor(doctorId);
    return new ResponseEntity<>("Doctor Removed Successfully ",HttpStatus.OK);
    }

}
