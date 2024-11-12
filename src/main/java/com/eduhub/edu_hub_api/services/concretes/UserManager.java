package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.models.User;
import com.eduhub.edu_hub_api.repositories.UserRepository;
import com.eduhub.edu_hub_api.services.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UserManager implements UserService {
    private final UserRepository userRepository;

    @Override
    public ResponseEntity<List<User>> getAllUsers(){
        List<User>users = this.userRepository.findAll();

        return ResponseEntity.ok(users);
    }

}
