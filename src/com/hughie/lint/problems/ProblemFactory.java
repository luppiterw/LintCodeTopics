package com.hughie.lint.problems;

import com.hughie.lint.iml.IResult;
import com.hughie.lint.model.CommonResult;
import com.hughie.lint.model.ResultKit;

public class ProblemFactory {
    public static CommonResult getResult(int number, Object ... args) {
        return innerGetResult(ProblemEnum.getProblemClass(number), args);
    }

    /**
     * @param problemEnumString 参考 P0001 {@link ProblemEnum}
     *
     * */
    public static CommonResult getResult(String problemEnumString, Object ... args) {
        return innerGetResult(ProblemEnum.getProblemClass(problemEnumString), args);
    }


    private static CommonResult innerGetResult(Class clazz, Object ... args) {
        if(clazz == null) return ResultKit.fix(null, "未知的问题编号");

        try {
            Object instance = clazz.newInstance();
            if(!(instance instanceof IResult)) {
                return ResultKit.fix(null, "问题类型异常");
            }
            return ((IResult) instance).calculateResult(args);

        } catch (InstantiationException | IllegalAccessException e) {
            return ResultKit.fix(null, e.toString());
        }
    }

}
