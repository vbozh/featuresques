package canal;

import java.util.Objects;

public class CodeAnalyzeMe {

    String s;
    Objects objects;
    Integer i;

    public CodeAnalyzeMe() {
    }

    void method() {
        System.out.println(string1("str"));
    }

    //label change

    public void foo() {
        method();
        Thread.dumpStack();
    }

    public String string1(String str) {
        return this.string1(str);
    }


}