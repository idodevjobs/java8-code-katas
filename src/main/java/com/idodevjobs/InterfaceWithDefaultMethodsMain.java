package com.idodevjobs;

public class InterfaceWithDefaultMethodsMain implements InterfaceWithDefaultMethods {

    public static void main (String[] args) {
        System.out.println(new InterfaceWithDefaultMethodsMain().sayHello("test"));
    }
}

interface InterfaceWithDefaultMethods {
    default String sayHello(String message) {
        return "hello " + message;
    }
}
