package com.hughie.lint.problems;

enum ProblemEnum {
    P0001(1, P0001_A_Plus_B.class),
    P0002(2, P0002_TailZero.class),;


    ProblemEnum(int number, Class problemClass) {
        this.number = number;
        this.problemClass = problemClass;
    }

    static Class getProblemClass(int number) {
        for(ProblemEnum problemEnum: ProblemEnum.values()) {
            if(problemEnum.number == number) return problemEnum.problemClass;
        }
        return null;
    }

    static Class getProblemClass(String problemEnumString) {
        for(ProblemEnum problemEnum: ProblemEnum.values()) {
            if(problemEnum.toString().equals(problemEnumString)) return problemEnum.problemClass;
        }
        return null;
    }

    private int number;
    private Class problemClass;

}
