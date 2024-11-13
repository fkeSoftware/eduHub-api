package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.requests.userRequest.AddUserRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.userResponse.GetUserListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<GetUserListResponse>> getAllUsers();
    ResponseEntity<String>addUser(AddUserRequest addUserRequest);
}
