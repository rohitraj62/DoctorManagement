package com.rohit.DoctorManagement.repositories;

import com.rohit.DoctorManagement.entities.SpecialitySymptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialitySymptomRepository extends JpaRepository<SpecialitySymptom,Integer> {

    SpecialitySymptom findBySymptom(String Symptom);

}
