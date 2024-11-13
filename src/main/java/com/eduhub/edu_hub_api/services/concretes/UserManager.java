package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.constants.MessageConstants;
import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.City;
import com.eduhub.edu_hub_api.models.District;
import com.eduhub.edu_hub_api.models.User;
import com.eduhub.edu_hub_api.repositories.CityRepository;
import com.eduhub.edu_hub_api.repositories.DistrictRepository;
import com.eduhub.edu_hub_api.repositories.UserRepository;
import com.eduhub.edu_hub_api.services.abstracts.UserService;
import com.eduhub.edu_hub_api.services.dtos.requests.branchRequest.AddBranchRequest;
import com.eduhub.edu_hub_api.services.dtos.requests.userRequest.AddUserRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.userResponse.GetUserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class UserManager implements UserService {
    private final UserRepository userRepository;
    private final DistrictRepository districtRepository;
    private final CityRepository cityRepository;
    private ModelMapperService mapperService;

    public ResponseEntity<List<GetUserListResponse>> getAllUsers() {
        List<User> users = this.userRepository.findAll();

        List<GetUserListResponse> userResponses = users.stream().map(user -> this.mapperService.forResponse().map(user, GetUserListResponse.class)).collect(Collectors.toList());

        return ResponseEntity.ok(userResponses);
    }

    public ResponseEntity<String> addUser(AddUserRequest addUserRequest){
        District district = districtRepository.findById(addUserRequest.getDistrictId())
                .orElseThrow(() -> new RuntimeException(MessageConstants.DISTRICT.getMessage() + " " + MessageConstants.ID_NOT_FOUND.getMessage()));
        City city = cityRepository.findById(addUserRequest.getCityId())
                .orElseThrow(() -> new RuntimeException(MessageConstants.CITY.getMessage() + " " + MessageConstants.ID_NOT_FOUND.getMessage()));
        User user = mapperService.forRequest().map(addUserRequest, User.class);
        //user.setIdNo(addUserRequest.getIdNo());
        user.setDistrict(district);
        user.setCity(city);
        userRepository.save(user);

        String successMessage = MessageConstants.USER.getMessage() + " " + MessageConstants.ADD.getMessage();

        return ResponseEntity.ok(successMessage);
    }

}
