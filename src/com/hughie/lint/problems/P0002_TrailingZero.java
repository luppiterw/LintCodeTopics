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

class P0002_TrailingZero implements IResult{
    /**
     * 方案1
     * 1、先计算阶层值
     * 2、计算所得值尾部连续0的个数
     *
     * 问题
     * 1、n超过一定值后，无法保存相应规模的数值
     * 2、时间复杂度无法达到O(logN)
     * @param n: 待计算阶层的值
     * @return : 返回值
     */
    private long trailingZero_1(long n) {
        long result = 1;
        for(long i = n; i >= 1; i --) {
            result *= i;
            System.out.println(i + "- " + result);
        }

        long zeroCount = 0;
        long quotient, remainder;
        for(int i = 10; ; i *= 10) {
            System.out.println(i + " result = " + result + " result % i  = " + (result % i) +
                    " quotient=" + (result / i));
            quotient = result / i ;
            remainder = result % i;
            if((remainder != 0) || (quotient * i != result)) break;
            zeroCount ++;
        }

        return zeroCount;
    }

    /**
     * 方案2
     * 尾数0只可能由 5的倍数 * 偶数 获得
     * 此处的偶数，应该取非5的倍数
     * 5的倍数5、10、15、20、25、30、35……对应数值出现时有足够多的偶数与之匹配
     * 包含(5的x次方 5、25、125、675…)
     * 故而只需要计算
     *
     * @param n: 待计算阶层的值
     * @return : 返回值
     */
    private long trailingZero_2(long n) {


        return 0;
    }



    @Override
    public CommonResult calculateResult(Object... args) {
        if(args == null || args.length != 1)
            return ResultKit.fix(null, "参数个数非1");
        if(!(args[0] instanceof Integer))
            return ResultKit.fix(null, "参数类型错误");

//        return ResultKit.fix(trailingZero_1((Integer) args[0]), "方案1 计算成功");
        return ResultKit.fix(trailingZero_2((Integer) args[0]), "方案2 计算成功");

    }
}
