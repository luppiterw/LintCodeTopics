package com.hughie.lint.model;

public class CommonResult {
    private CommonResult() {

    }

    CommonResult(Object returnResult, String errorMessage) {
        this.returnResult = returnResult;
        this.errorMessage = errorMessage;
    }

//    static CommonResult generateResult(Object returnResult, String errorMessage) {
//        return new CommonResult(returnResult, errorMessage);
//    }

    public Object getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(Object returnResult) {
        this.returnResult = returnResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "returnResult=" + returnResult +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    private Object returnResult;
    private String errorMessage;
}
