package com.eduhub.edu_hub_api.core.utilities.results;

public class SuccessDataResult<T> extends DataResult {
    public SuccessDataResult(T data, String message){
        super(data,message,true);
    }

    public SuccessDataResult(T data){
        super(data, true);
    }

    public SuccessDataResult(String message){
        super(null, message, true);
    }
}
