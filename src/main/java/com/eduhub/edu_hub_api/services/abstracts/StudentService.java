package com.eduhub.edu_hub_api.services.abstracts;

import com.eduhub.edu_hub_api.services.dtos.requests.studentRequest.AddStudentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.studentRespose.GetStudentListResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    ResponseEntity<List<GetStudentListResponse>>getAllStudents();
    ResponseEntity<String>addStudent(AddStudentRequest addStudentRequest);

}
