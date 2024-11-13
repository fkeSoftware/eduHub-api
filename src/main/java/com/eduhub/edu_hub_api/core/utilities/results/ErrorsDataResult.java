package com.eduhub.edu_hub_api.core.utilities.results;

public class ErrorsDataResult<T> extends DataResult{

    public ErrorsDataResult(T data, String message){
        super(data, message, false);
    }

    public ErrorsDataResult(T data){
        super(data, false);
    }

    public ErrorsDataResult(String message){
        super(null, message, false);
    }
}
