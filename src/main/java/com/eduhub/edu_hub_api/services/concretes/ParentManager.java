package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.constants.MessageConstants;
import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.Parent;
import com.eduhub.edu_hub_api.models.Student;
import com.eduhub.edu_hub_api.models.User;
import com.eduhub.edu_hub_api.repositories.ParentRepository;
import com.eduhub.edu_hub_api.repositories.StudentRepository;
import com.eduhub.edu_hub_api.repositories.UserRepository;
import com.eduhub.edu_hub_api.services.abstracts.ParentService;
import com.eduhub.edu_hub_api.services.dtos.requests.parentRequest.AddParentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.parentResponse.GetParentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor


public class ParentManager implements ParentService {
    private final ParentRepository parentRepository;
    private final StudentRepository studentRepository;
    private final UserRepository userRepository;
    private final ModelMapperService mapperService;

    public ResponseEntity<List<GetParentListResponse>> getAllParents() {
        List<Parent> parents = this.parentRepository.findAll();

        List<GetParentListResponse> parentListResponses = parents.stream().map(parent -> this.mapperService.forResponse().map(parent, GetParentListResponse.class)).collect(Collectors.toList());
        return ResponseEntity.ok(parentListResponses);
    }

    public ResponseEntity<String>addParent(AddParentRequest addParentRequest){
        User user = userRepository.findById(addParentRequest.getUserId()).orElseThrow(()->new RuntimeException(MessageConstants.USER.getMessage() + " " + MessageConstants.ID_NOT_FOUND.getMessage()));
        Student student = studentRepository.findById(addParentRequest.getStudentId()).orElseThrow(()->new RuntimeException(MessageConstants.STUDENT.getMessage() + " " + MessageConstants.ID_NOT_FOUND.getMessage()));

        Parent parent = mapperService.forRequest().map(addParentRequest, Parent.class);
        parentRepository.save(parent);

        String successMessage = MessageConstants.PARENT.getMessage() + " " + MessageConstants.ADD.getMessage();
        return ResponseEntity.ok(successMessage);

    }

}
