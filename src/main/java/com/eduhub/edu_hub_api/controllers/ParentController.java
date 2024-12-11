package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.ParentService;
import com.eduhub.edu_hub_api.services.dtos.requests.parentRequest.AddParentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.parentResponse.GetParentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/parents")
@AllArgsConstructor
@CrossOrigin

public class ParentController {
    private final ParentService parentService;

    @GetMapping()
    public ResponseEntity<List<GetParentListResponse>>getAllParents(){
        return this.parentService.getAllParents();
    }

    @PostMapping
    public ResponseEntity<String>addParent(@RequestBody AddParentRequest addParentRequest){
        return this.parentService.addParent(addParentRequest);
    }
}
