package codeAnalysis;

import java.util.Arrays;
import java.util.List;

public class ImplicitTypes {

    public static void main(String[] args) {
       var list = getList(); // List<String> is inferred
    }

    private static List<String> getList() {
        return Arrays.asList("hello", "world");
    }
}