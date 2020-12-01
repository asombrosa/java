package com.concepts.tricky.questions;

public class Overloading {
    public static void main(String[] args) {
        foo(null);
    }

    public static void foo(Object o) {
        System.out.println("Object argument");
    }

    public static void foo(String s) {
        //This will be executed
        System.out.println("String argument");
    }

    /*
    If we have another method like below we will get compile time error
    public static void foo(StringBuffer i){
	    System.out.println("StringBuffer impl");
    }
     */
}
