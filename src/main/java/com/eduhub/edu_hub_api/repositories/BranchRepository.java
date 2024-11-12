package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
    List<Branch> findByTitle(String title);
}
