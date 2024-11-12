package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Integer> {
    List<District> findByCityId(int cityId);
}
