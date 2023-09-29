package com.rohit.DoctorManagement.dtos;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class SpecialitySymptomDto {
    private Integer specialityId;
    private String speciality;
    private String symptom;
}

