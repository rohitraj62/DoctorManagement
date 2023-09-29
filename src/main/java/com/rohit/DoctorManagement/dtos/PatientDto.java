package com.rohit.DoctorManagement.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Builder
public class PatientDto {

    private Integer patientId;
    @Size(min=3,message = "Invalid Name !! Name must be at least three Characters. ")
    private String patientName;

    @Size(max=20,message = "Invalid City !! Name must be at max 20 Characters. ")
    private String patientCity;

    @Email
    private String patientEmail;

    @Size(min=10,max=10,message = "Invalid No")
    private String patientPhoneNumber;

    private String patientSymptom;
}
