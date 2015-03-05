package com.idodevjobs;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> sayHello = (String s) -> {return "hello " + s;};
        System.out.println(sayHello.apply("test"));
    }
}
