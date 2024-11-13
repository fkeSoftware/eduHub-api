package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.StudentService;
import com.eduhub.edu_hub_api.services.dtos.requests.studentRequest.AddStudentRequest;
import com.eduhub.edu_hub_api.services.dtos.responses.studentRespose.GetStudentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
@CrossOrigin

public class StudentController {
    private final StudentService studentService;
    @GetMapping()
    public ResponseEntity<List<GetStudentListResponse>> getAllStudents(){
        return this.studentService.getAllStudents();
    }
    @PostMapping()
    public ResponseEntity<String>addStudent(@RequestBody AddStudentRequest addStudentRequest){
        return this.studentService.addStudent(addStudentRequest);
    }
}
