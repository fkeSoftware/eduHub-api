package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.User;
import com.eduhub.edu_hub_api.repositories.UserRepository;
import com.eduhub.edu_hub_api.services.abstracts.UserService;
import com.eduhub.edu_hub_api.services.dtos.responses.userResponse.GetUserListResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class UserManager implements UserService {
    private final UserRepository userRepository;
    private ModelMapperService mapperService;
    @Override
    public ResponseEntity<List<GetUserListResponse>> getAllUsers(){
        List<User>users = this.userRepository.findAll();

        List<GetUserListResponse> userResponses = users.stream()
                .map(user -> this.mapperService.forResponse()
                        .map(user, GetUserListResponse.class))
                .collect(Collectors.toList());


        return ResponseEntity.ok(userResponses);

    }

}
