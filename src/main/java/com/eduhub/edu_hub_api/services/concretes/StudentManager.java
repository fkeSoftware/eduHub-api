package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.constants.MessageConstants;
import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.Student;
import com.eduhub.edu_hub_api.models.User;
import com.eduhub.edu_hub_api.repositories.StudentRepository;
import com.eduhub.edu_hub_api.repositories.UserRepository;
import com.eduhub.edu_hub_api.services.abstracts.StudentService;
import com.eduhub.edu_hub_api.services.dtos.requests.studentRequest.AddStudentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.studentRespose.GetStudentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    private final StudentRepository studentRepository;
    private final UserRepository userRepository;
    private ModelMapperService mapperService;

    public ResponseEntity<List<GetStudentListResponse>>getAllStudents(){
        List<Student> students = this.studentRepository.findAll();

        List<GetStudentListResponse> studentListResponses = students.stream().map(student -> this.mapperService.forResponse().map(student, GetStudentListResponse.class)).collect(Collectors.toList());

        return ResponseEntity.ok(studentListResponses);
    }

    public ResponseEntity<String>addStudent(AddStudentRequest addStudentRequest){
        User user = userRepository.findById(addStudentRequest.getUserId()).orElseThrow(()->new RuntimeException(MessageConstants.USER.getMessage() + " " + MessageConstants.ID_NOT_FOUND.getMessage()));
        Student student = mapperService.forRequest().map(addStudentRequest, Student.class);
        studentRepository.save(student);

        String successMessage = MessageConstants.STUDENT.getMessage() + " " + MessageConstants.ADD.getMessage();
        return ResponseEntity.ok(successMessage);
    }
}
