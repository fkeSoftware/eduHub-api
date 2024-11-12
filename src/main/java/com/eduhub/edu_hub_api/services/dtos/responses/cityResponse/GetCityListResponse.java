package com.eduhub.edu_hub_api.services.dtos.responses.cityResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetCityListResponse {
    private int id;
    private String cityName;
}
