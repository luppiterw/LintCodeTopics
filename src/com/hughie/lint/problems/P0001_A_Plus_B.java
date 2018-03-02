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

/**
 * 解题思路：
 * 1、不能使用算数运算符 => 使用位运算符
 * 2、按位异或 (得到 r1) == 单个位使用加法运算，但不进位
 * 3、当运算的位均为1时，才需要进位 => 使用按位与运算+左移操作，算出进位值 (得到 r2)
 * 4、r1、r2 重复以上运算，直到 r2为0（无进位）为止
 *
 * */

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
        return calAPlushB(a, b);
//        return recurseAB(a, b);
//        return a + b;
    }

    /**
     * 递归方法计算
     * */
    private int recurseAB(int a, int b) {
        if(b == 0) return a;
        return recurseAB(a ^ b, (a & b) << 1);
    }

    /**
     * 递推方法
     * */
    private int calAPlushB(int a, int b) {
        int sum, carry;
        while(b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
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
