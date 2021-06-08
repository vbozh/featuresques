package com;

public class ReformatCode {

    public void horriblyFormattedMethod() {
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        for (int i = 0; i < 3; i++) System.out.println("I have no idea where the indentation is supposed to be");
    }

    private final String s = "sss";

    void loop() {
        for (int i = 0; i < Integer.getInteger(this.s); i++) {
            System.out.println(this.s);
        }
    }
    //test it
}
