package com.eduhub.edu_hub_api.services.dtos.responses.branchResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBranchListResponse {
    private int id;
    private String title;
}
