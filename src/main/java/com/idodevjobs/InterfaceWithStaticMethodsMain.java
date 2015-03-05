package com.idodevjobs;

public class InterfaceWithStaticMethodsMain {

    public static void main (String[] args) {
        System.out.println(InterfaceWithStaticMethods.sayHello("test"));
    }
}

interface InterfaceWithStaticMethods {
    static String sayHello(String message) {
        return "hello " + message;
    }
}
