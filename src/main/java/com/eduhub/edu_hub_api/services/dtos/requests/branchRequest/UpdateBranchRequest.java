package com.eduhub.edu_hub_api.services.dtos.requests.branchRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBranchRequest {
    private int id;
    private String title;
}