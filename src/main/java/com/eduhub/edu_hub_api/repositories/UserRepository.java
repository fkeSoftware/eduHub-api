package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
