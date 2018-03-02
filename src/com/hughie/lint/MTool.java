package com.hughie.lint;

import com.hughie.lint.problems.ProblemFactory;

import java.util.Arrays;

class MTool {

    static void print(int number, Object... args) {
        final long startTime = System.currentTimeMillis();
        System.out.println(ProblemFactory.getResult(number, args).toString());
        System.out.println("    ：" + number + " " + Arrays.asList(args));
        System.out.println("    ：耗时 " + (System.currentTimeMillis() - startTime) + "ms");
    }

    static void print(String problemEnumString, Object... args) {
        final long startTime = System.currentTimeMillis();
        System.out.println(ProblemFactory.getResult(problemEnumString, args).toString());
        System.out.println("    ：" + problemEnumString + " " + Arrays.asList(args));
        System.out.println("    ：耗时 " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
