package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.DistrictService;
import com.eduhub.edu_hub_api.services.dtos.responses.districtResponse.GetDistrictListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
@AllArgsConstructor
public class DistrictController {

    private final DistrictService districtService;

    @GetMapping("/city/{cityId}")
    public ResponseEntity<List<GetDistrictListResponse>> getDistrictsByCityId(@PathVariable int cityId) {
        return districtService.getDistrictsByCityId(cityId);
    }
}
