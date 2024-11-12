package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.BranchService;
import com.eduhub.edu_hub_api.services.dtos.requests.branchRequest.AddBranchRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.branchResponse.GetBranchListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/branches")
@AllArgsConstructor
@CrossOrigin

public class BranchController {
    private final BranchService branchService;

    @GetMapping()
    public ResponseEntity<List<GetBranchListResponse>> getAllBranches(){
        return this.branchService.getAllBranches();
    }
    @PostMapping()
    public ResponseEntity<String>addBranch(@RequestBody AddBranchRequest addBranchRequest){
        return this.branchService.addBranch(addBranchRequest);
    }
}
