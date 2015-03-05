package com.idodevjobs;

public class LambdaExpressionsFunctionalInterfacesMain {
    public static void main (String [] args) {
        FunctionalInterfacesExample example = (String message) -> {return "hello " + message;};
        System.out.println(example.sayHello("test"));
    }
}

@FunctionalInterface
interface FunctionalInterfacesExample {
    String sayHello (String message);
}
