package com.concepts.inheritance;

import com.concepts.inheritance.package1.BaseClass;

public class SubClassInsidePackageWithOverriddenMethods extends BaseClass {

    //can't override as it is inaccessible
    //@Override
    private void privateMethod() {
        System.out.println("Private method of class SubClass");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Protected method of class SubClass");
    }

    /*
     * We can't create default method inside a class
     * */
//    default void defaultMethod(){
//        System.out.println("Default method of class First");
//    }

    @Override
    public void publicMethod() {
        System.out.println("Public method of class SubClass");
    }

    //can't override as inaccessible
    //@Override
    void defaultMethod() {
        System.out.println("Default method of class SubClass");
    }

    public static void main(String[] args) {
        BaseClass subclass = new SubClassInsidePackageWithOverriddenMethods();
        //subclass.defaultMethod();
        //we can override the method of base class but
        //cannot call it like this because object is
        //up casted to base class
        //subclass.protectedMethod();
        subclass.publicMethod();
        //we cannot access the private method in subclass
        BaseClass baseClass = new BaseClass();
        //baseClass.defaultMethod();
        //baseClass.protectedMethod();
        baseClass.publicMethod();
    }
}
