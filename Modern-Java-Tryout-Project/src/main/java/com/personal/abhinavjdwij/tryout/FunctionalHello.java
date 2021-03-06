package com.personal.abhinavjdwij.tryout;

@FunctionalInterface // single function interface
interface Hello {
    String helloMsg(String name);
}

public class FunctionalHello {
    public static void main(String[] args) {
        Hello helloAbhinav = (x) -> "Hello, " + x;
        System.out.println(helloAbhinav.helloMsg("Abhinav"));
    }
}
