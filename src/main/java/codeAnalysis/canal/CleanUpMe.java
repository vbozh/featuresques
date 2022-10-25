package codeAnalysis.canal;

public class CleanUpMe {

    int foo;

    public String[] process(String[] value) {
        return value;
    }

    void bar() {
        this.foo += 1;
    }

    //change

    public void foo() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}