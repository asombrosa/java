package com.concepts.inheritance;

import com.concepts.inheritance.package1.BaseClass;

public class SubClassOutsidePackage extends BaseClass {

    private void privateMethod(){
        System.out.println("Private method of class SubClass");
    }
    protected void protectedMethod(){
        System.out.println("Protected method of class SubClass");
    }

    /*
     * We can't create default method inside a class
     * */
//    default void defaultMethod(){
//        System.out.println("Default method of class First");
//    }
    public void publicMethod(){
        System.out.println("Public method of class SubClass");
    }

    void defaultMethod(){
        System.out.println("Default method of class SubClass");
    }

    public static void main(String[] args) {
        BaseClass subclass = new SubClassOutsidePackage();
        //the type of object we have, it's method will be called
        //but we still can't call default, private and protected method
        //even of sub class because our object is casted to BaseClass
        //we cannot access the private, default and protected method in subclass
        //subclass.defaultMethod();
        //subclass.protectedMethod();
        subclass.publicMethod();
        BaseClass baseClass = new BaseClass();
        //baseClass.defaultMethod();
        //baseClass.protectedMethod();
        baseClass.publicMethod();
    }
}
