package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.UserService;
import com.eduhub.edu_hub_api.services.dtos.responses.userResponse.GetUserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
@CrossOrigin

public class UserController {
    private final UserService userService;
    @GetMapping()
    public ResponseEntity<List<GetUserListResponse>> getAllUsers(){
        return this.userService.getAllUsers();
    }

}
