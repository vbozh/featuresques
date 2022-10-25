package codeAnalysis.canal;

import java.util.Objects;

public class CodeAnalyzeMe {

    String s;
    Objects objects;
    Integer i;

    //

    public CodeAnalyzeMe() {
    }

    //label change1112

    void method() {
        System.out.println();
    }

    public void foo() {
        method();
        //Thread.dumpStack();
    }

    public String[] process(String[] value) {
        return value;
    }


    public void string1(int x) {
        if (x > 0) System.out.println("x is positive");
    }
}