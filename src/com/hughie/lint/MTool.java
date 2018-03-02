package com.hughie.lint;

import com.hughie.lint.problems.ProblemFactory;

class MTool {

    static void print(int number, Object... args) {
        System.out.println(ProblemFactory.getResult(number, args).toString());
    }

    static void print(String problemEnumString, Object... args) {
        System.out.println(ProblemFactory.getResult(problemEnumString, args).toString());
    }
}
