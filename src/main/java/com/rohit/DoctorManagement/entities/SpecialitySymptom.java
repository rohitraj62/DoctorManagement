package com.rohit.DoctorManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="SpecialitySymptom")
public class SpecialitySymptom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer specialityId;

    @Column(length = 25,nullable = false)
    private String speciality;
   @Column(length = 25,nullable = false)
    private String symptom;
}

