package com.rohit.DoctorManagement.dtos;


import com.rohit.DoctorManagement.validator.CityValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DoctorDto {


    Integer doctorId;


    @Size(min=3,message = "Invalid Name !! Name must be at least three Characters. ")
    String doctorName;

    @CityValid(message = "Invalid City Name")
    String doctorCity;

    @Email
    String doctorEmail;

     @Size(min=10, max=10,message = "Enter Valid Phone Number")
    String doctorPhoneNumber;

    String doctorSpeciality;
}
