package com.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeParametersLowerBound {
    public static void main(String[] args) {
        List<? super Integer> integerArrayList = new ArrayList<Integer>();
        // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> numberArrayList = new ArrayList<Number>();
        // Number is a superclass of Integer
        List<? super Integer> objectArrayList = new ArrayList<Object>();
        // Object is a superclass of Integer
        // List<? super Object> stringArrayList = new ArrayList<String>();
        // So now if I use the lower bound as Object class
        // and try for String, it will throw compile time exception
    }
}
