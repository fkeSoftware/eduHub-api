package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.requests.parentRequest.AddParentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.parentResponse.GetParentListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ParentService {
    ResponseEntity<List<GetParentListResponse>>getAllParents();
    ResponseEntity<String>addParent(AddParentRequest addParentRequest);

}
