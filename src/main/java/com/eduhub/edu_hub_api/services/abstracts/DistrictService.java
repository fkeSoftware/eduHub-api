package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.responses.districtResponse.GetDistrictListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DistrictService {
    ResponseEntity<List<GetDistrictListResponse>> getDistrictsByCityId(int cityId);
}
