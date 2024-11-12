package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> getAllUsers();
}
