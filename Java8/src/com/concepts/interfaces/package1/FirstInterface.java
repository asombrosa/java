package com.concepts.interfaces.package1;

public interface FirstInterface {
    default void defaultMethod(){
        System.out.println("I am from interface 1");
    }
    default void secondDefaultMethod(){
        System.out.println("I am from interface 1");
        System.out.println("I am Second default method");
    }
}
