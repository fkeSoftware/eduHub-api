package com.eduhub.edu_hub_api.services.dtos.responses.districtResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetDistrictListResponse {
    private int id;
    private int cityId;
    private String districtName;
}
