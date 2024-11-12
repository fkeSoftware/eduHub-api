package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.City;
import com.eduhub.edu_hub_api.repositories.CityRepository;
import com.eduhub.edu_hub_api.services.abstracts.CityService;
import com.eduhub.edu_hub_api.services.dtos.responses.cityResponse.GetCityListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CityManager implements CityService {
    private final CityRepository cityRepository;
    private ModelMapperService mapperService;

    @Override
    public ResponseEntity<List<GetCityListResponse>> getAllCities(){
        List<City>cities = this.cityRepository.findAll();

        List<GetCityListResponse> cityListResponses = cities.stream()
                .map(city -> this.mapperService.forResponse()
                        .map(city, GetCityListResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(cityListResponses);
    }
}
