package com.generics;

// This class only accepts type parameters as any class
// which extends class A or class A itself.
// Passing any other type will cause compiler time error

class Bound<T extends A> {

    private final T objRef;

    public Bound(T obj) {
        this.objRef = obj;
    }

    public void doRunTest() {
        this.objRef.displayClass();
    }
}

class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

class BoundedTypeParameters {

    public static void main(String[] a) {

        // Creating object of sub class C and
        // passing it to Bound as a type parameter.
        Bound<C> cBound = new Bound<>(new C());
        cBound.doRunTest();

        // Creating object of sub class B and
        // passing it to Bound as a type parameter.
        Bound<B> bBound = new Bound<>(new B());
        bBound.doRunTest();

        // similarly passing super class A
        Bound<A> aBound = new Bound<>(new A());
        aBound.doRunTest();

        //If I try to create Bound<String>
        //it will throw an error
        //Bound<String> stringBound = new Bound<String>(new String());
        //stringBound.doRunTest();
    }
}

