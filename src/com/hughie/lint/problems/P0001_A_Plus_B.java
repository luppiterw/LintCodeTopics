package com.hughie.lint.problems;

/*
1. A + B 问题
http://www.lintcode.com/zh-cn/problem/a-b-problem/
给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
说明
a和b都是 32位 整数么？

是的
我可以使用位运算符么？

当然可以
样例
如果 a=1 并且 b=2，返回3
*/


import com.hughie.lint.iml.IResult;
import com.hughie.lint.model.CommonResult;
import com.hughie.lint.model.ResultKit;

class P0001_A_Plus_B implements IResult{
    /**
     * @param a: 输入整数
     * @param b: 输入整数
     * @return : 返回值
     */
    private int plushAB(int a, int b) {
        return recurseAB(a, b);
//        return a + b;
    }

    /**
     * 递归方法计算
     * */
    private int recurseAB(int a, int b) {
        if(b == 0) return a;
        return recurseAB(a ^ b, (a & b) << 1);
    }

    @Override
    public CommonResult calculateResult(Object... args) {
        if(args == null || args.length != 2)
            return ResultKit.fix(null, "参数个数非2");
        if(!(args[0] instanceof Integer) || !(args[1] instanceof Integer))
            return ResultKit.fix(null, "参数类型错误");

        return ResultKit.fix(plushAB((Integer) args[0], (Integer) args[1]), "计算成功");
    }
}
