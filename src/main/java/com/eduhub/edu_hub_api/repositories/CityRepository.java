package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    Optional<City> findById(int id);
}
