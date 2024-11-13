package com.eduhub.edu_hub_api.core.utilities.constants;

public enum MessageConstants {
    USER("User"), BRANCH("Branch"), STUDENT("Student"), PARENT("Parent"), TEACHER("Teacher"), CLASSROOM("Classroom"),
    ADD("insertion successful.."),
    UPDATE("update successful.."),
    DELETE("deletion successful.."),
    GET_ALL("All data listed.."),
    GET("The data was found.."),
    ID_NOT_FOUND("Id not found !"),
    NOT_FOUND("There is no data !"),
    ALREADY_EXISTS("Already exists !"),
   LOGIN_SUCCESSS("Login successful, WELCOME !");

    private final String message;

    MessageConstants(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
