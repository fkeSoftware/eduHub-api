package com.eduhub.edu_hub_api.repositories;

import com.eduhub.edu_hub_api.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
