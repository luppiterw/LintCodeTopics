package com.hughie.lint.iml;

import com.hughie.lint.model.CommonResult;

public interface IResult {
    CommonResult calculateResult(Object ... args);
}
