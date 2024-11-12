package com.eduhub.edu_hub_api.services.dtos.responses.userResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetUserListResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
