package com.rohit.DoctorManagement.repositories;

import com.rohit.DoctorManagement.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {


     List<Doctor> findAllByDoctorSpecialityAndDoctorCity(String doctorCity, String doctorSpeciality);
}




