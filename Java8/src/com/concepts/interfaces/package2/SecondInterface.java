package com.concepts.interfaces.package2;

public interface SecondInterface {
    default void defaultMethod(){
        System.out.println("I am from interface 2");
    }
}
