package com.concepts.tricky.questions.overloading;

public class OverloadedMain {
    public static void main(String[] arr) {
        System.out.println("Main with String Array as parameter");
    }

    public static void main(String arr) {
        System.out.println("Main with String as parameter");
    }
}

