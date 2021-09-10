package canal;

public class CleanUpMe extends GeneralAnalysis {

    int foo;

    public String[] process(String[] value) {
        return value;
    }

    void bar() {
        this.foo += 1;
    }

    int c;

    @Override
    public String str() {
        return super.str();
    }

    void show() {
        System.out.println("Inside Class B values=" + this.a + " " + this.b + " " + this.c);
    }
}