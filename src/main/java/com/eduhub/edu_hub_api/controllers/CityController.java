package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.CityService;
import com.eduhub.edu_hub_api.services.dtos.responses.cityResponse.GetCityListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cities")
@AllArgsConstructor
@CrossOrigin
public class CityController {
    private final CityService cityService;

    @GetMapping()
    public ResponseEntity<List<GetCityListResponse>>getAllCities(){
        return this.cityService.getAllCities();
    }
}
