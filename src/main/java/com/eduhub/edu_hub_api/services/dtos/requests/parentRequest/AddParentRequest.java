package com.eduhub.edu_hub_api.services.dtos.requests.parentRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddParentRequest {
    private int studentId;
    private String relationship;
    private int userId;
}
