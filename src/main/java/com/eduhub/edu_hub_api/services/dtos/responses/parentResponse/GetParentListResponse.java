package com.eduhub.edu_hub_api.services.dtos.responses.parentResponse;

import com.eduhub.edu_hub_api.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetParentListResponse {
    private int studentId;
    private String relationShip;
    private User user;


}
