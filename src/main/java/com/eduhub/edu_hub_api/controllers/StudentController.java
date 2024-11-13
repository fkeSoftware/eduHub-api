package com.eduhub.edu_hub_api.controllers;

import com.eduhub.edu_hub_api.services.abstracts.StudentService;
import com.eduhub.edu_hub_api.services.dtos.responses.studentRespose.GetStudentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
