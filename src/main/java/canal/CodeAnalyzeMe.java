package canal;

import java.util.Objects;

public class CodeAnalyzeMe {

    String s;
    Objects objects;
    Integer i;

    public CodeAnalyzeMe() {
    }

    void method() {
        System.out.println();
    }

    //label change

    public void foo() {
        method();
        Thread.dumpStack();
    }

    public void string1(int x) {
        if (x > 0) System.out.println("x is positive");
    }


}