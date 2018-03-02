package com.hughie.lint.problems;

/*
2. 尾部的零
http://www.lintcode.com/zh-cn/problem/trailing-zeros/
设计一个算法，计算出n阶乘中尾部零的个数

样例
11! = 39916800，因此应该返回 2

挑战
O(logN)的时间复杂度
*/


/*
    解题思路：


*/

import com.hughie.lint.iml.IResult;
import com.hughie.lint.model.CommonResult;
import com.hughie.lint.model.ResultKit;

class P0002_TailZero implements IResult{
    /**
     * @param n: 待计算阶层的值
     * @return : 返回值
     */
    private int tailZero(int n) {
        return 0;
    }



    @Override
    public CommonResult calculateResult(Object... args) {
        if(args == null || args.length != 1)
            return ResultKit.fix(null, "参数个数非1");
        if(!(args[0] instanceof Integer))
            return ResultKit.fix(null, "参数类型错误");

        return ResultKit.fix(tailZero((Integer) args[0]), "计算成功");
    }
}
