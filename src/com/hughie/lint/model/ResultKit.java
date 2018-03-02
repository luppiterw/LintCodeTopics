package com.hughie.lint.model;

public class ResultKit {
    public static CommonResult fix(Object returnResult, String errorMessage) {
        return new CommonResult(returnResult, errorMessage);
    }
}
