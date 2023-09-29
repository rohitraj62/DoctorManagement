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
@Table(name="Doctor")
public class Doctor{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer doctorID;

    @Column(length=100,nullable = false)
    private String doctorName;
    @Column(length =10,nullable = false)
    private String doctorCity;
    @Column(length =100,nullable = false)
    private String doctorEmail;

    @Column(length =10,nullable = false)
    private String doctorPhoneNumber;

    @Column(length =20,nullable = false)
    private String doctorSpeciality;




//    @OneToOne
//    @JoinColumn(name = "student_id")
//    private Student student;
}
