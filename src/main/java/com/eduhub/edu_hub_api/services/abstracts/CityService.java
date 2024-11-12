package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.responses.cityResponse.GetCityListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CityService {

    ResponseEntity<List<GetCityListResponse>>getAllCities();
}
