package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.City;
import com.eduhub.edu_hub_api.models.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistrictRepository extends JpaRepository<District, Integer> {
    Optional<District> findById(int id);
    List<District> findByCityId(int cityId);
}
