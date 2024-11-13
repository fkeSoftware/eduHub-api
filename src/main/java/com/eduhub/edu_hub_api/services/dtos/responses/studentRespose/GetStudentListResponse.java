package com.eduhub.edu_hub_api.services.dtos.responses.studentRespose;

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

public class GetStudentListResponse {
    private int id;
    private String studentNo;
    private ClassRoom classroomName;
    private Teacher teacherName;
    private Parent parentName;
    private User userName;

}
