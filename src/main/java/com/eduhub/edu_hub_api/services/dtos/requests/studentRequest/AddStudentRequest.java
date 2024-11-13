package com.eduhub.edu_hub_api.services.dtos.requests.studentRequest;

import com.eduhub.edu_hub_api.models.ClassRoom;
import com.eduhub.edu_hub_api.models.Parent;
import com.eduhub.edu_hub_api.models.Teacher;
import com.eduhub.edu_hub_api.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddStudentRequest {
    private String studentNo;
    //private int classroomId;
    //private int teacherId;
    //private int parentId;
    private int userId;
}
