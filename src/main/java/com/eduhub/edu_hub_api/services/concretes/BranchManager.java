package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.constants.MessageConstants;
import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.Branch;
import com.eduhub.edu_hub_api.repositories.BranchRepository;
import com.eduhub.edu_hub_api.services.abstracts.BranchService;
import com.eduhub.edu_hub_api.services.dtos.requests.branchRequest.AddBranchRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.branchResponse.GetBranchListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class BranchManager implements BranchService {
    private final BranchRepository branchRepository;
    private ModelMapperService mapperService;

    public ResponseEntity<List<GetBranchListResponse>> getAllBranches() {
        List<Branch> branches = this.branchRepository.findAll();

        List<GetBranchListResponse> branchResponses = branches.stream().map(branch -> this.mapperService.forResponse().map(branch, GetBranchListResponse.class)).collect(Collectors.toList());

        return ResponseEntity.ok(branchResponses);
    }

    public ResponseEntity<String> addBranch(AddBranchRequest addBranchRequest) {
        Branch branch = mapperService.forRequest().map(addBranchRequest, Branch.class);
        branchRepository.save(branch);

        String successMessage = MessageConstants.BRANCH.getMessage() + " " + MessageConstants.ADD.getMessage();
        return ResponseEntity.ok(successMessage);
    }

}
