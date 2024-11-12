package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.requests.branchRequest.AddBranchRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.branchResponse.GetBranchListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BranchService {

    ResponseEntity<List<GetBranchListResponse>>getAllBranches();
    ResponseEntity<String> addBranch(AddBranchRequest addBranchRequest);
}
