package com.eduhub.edu_hub_api.services.dtos.requests.userRequest;

import com.eduhub.edu_hub_api.models.City;
import com.eduhub.edu_hub_api.models.District;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String idNo;
    private String password;
    private String phoneNumber;
    private LocalDate birthDate;
    private City cityName;
    private District districtName;
    private String address;
}
