package com.rohit.DoctorManagement.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
//@Table(name="Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer patientId;
    @Column(length = 100,nullable = false)
    private String patientName;

    @Column(length = 50,nullable = false)
    private String patientCity;

    @Column(length=100,nullable = false)
    private String patientEmail;

    @Column(length = 10,nullable = false)
    private String patientPhoneNumber;
    @Column(length=25,nullable = false)
    private String patientSymptom;

}
