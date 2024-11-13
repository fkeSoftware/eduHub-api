package com.eduhub.edu_hub_api.core.utilities.results;

public class Result {
    private String message;
    private boolean result;

    public Result(String message, boolean result) {
        this.message = message;
        this.result = result;
    }

    public Result(boolean result) {
        this.result = result;
    }

    public Result() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
