package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.District;
import com.eduhub.edu_hub_api.repositories.DistrictRepository;
import com.eduhub.edu_hub_api.services.abstracts.DistrictService;
import com.eduhub.edu_hub_api.services.dtos.responses.districtResponse.GetDistrictListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class DistrictManager implements DistrictService {
    private final DistrictRepository districtRepository;
    private ModelMapperService mapperService;

    @Override
    public ResponseEntity<List<GetDistrictListResponse>>GetAllDistricts(){
        List<District> districts = this.districtRepository.findAll();

        List<GetDistrictListResponse> districtListResponses = districts.stream()
                .map(district -> this.mapperService.forResponse()
                        .map(district, GetDistrictListResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(districtListResponses);
    }
}
