package com.concepts.interfaces.main;

import com.concepts.interfaces.package1.FirstInterface;
import com.concepts.interfaces.package2.SecondInterface;

public class Main implements FirstInterface, SecondInterface {

    public static void main(String[] args) {
        Main main = new Main();
        main.defaultMethod();
        //no need to override this default method
        //as we have no conflicts
        main.secondDefaultMethod();
    }

    /*
    If we have two interfaces containing default methods
    with same name, and one class implements both interfaces,
    the only option we have is to override the method,
    else we will get compilation error saying unrelated
    defaults
    This scenario is diamond problem and to solve it
    we need to override the method
     */
    @Override
    public void defaultMethod() {
        System.out.println("I am from Main class");
    }
}
