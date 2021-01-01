package com.concepts.inheritance.package1;

public class BaseClass {

    private void privateMethod(){
        System.out.println("Private method of class Base");
    }
    protected void protectedMethod(){
        System.out.println("Protected method of class Base");
    }

    /*
    * We can't create default method inside a class
    * */
//    default void defaultMethod(){
//        System.out.println("Default method of class First");
//    }
    public void publicMethod(){
        System.out.println("Public method of class Base");
    }

    void defaultMethod(){
        System.out.println("Default method of class Base");
    }
}
