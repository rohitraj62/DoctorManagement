package com.rohit.DoctorManagement.repositories;

import com.rohit.DoctorManagement.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
