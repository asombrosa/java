package com.concepts.inheritance.package1;

public class SubClassInsidePackage extends BaseClass {

    public static void main(String[] args) {
        BaseClass subclass = new SubClassInsidePackage();
        subclass.defaultMethod();
        subclass.protectedMethod();
        subclass.publicMethod();
        //we cannot access the private method in subclass
        BaseClass baseClass = new BaseClass();
        baseClass.defaultMethod();
        baseClass.protectedMethod();
        baseClass.publicMethod();
    }
}
