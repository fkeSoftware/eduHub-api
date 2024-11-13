package com.eduhub.edu_hub_api.services.concretes;

import com.eduhub.edu_hub_api.core.utilities.mappers.ModelMapperService;
import com.eduhub.edu_hub_api.models.Student;
import com.eduhub.edu_hub_api.repositories.StudentRepository;
import com.eduhub.edu_hub_api.services.abstracts.StudentService;
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
    private ModelMapperService mapperService;

    public ResponseEntity<List<GetStudentListResponse>>getAllStudents(){
        List<Student> students = this.studentRepository.findAll();

        List<GetStudentListResponse> studentListResponses = students.stream().map(student -> this.mapperService.forResponse().map(student, GetStudentListResponse.class)).collect(Collectors.toList());

        return ResponseEntity.ok(studentListResponses);
    }
}
