package com.concepts.inheritance.package1;

public class SubClassInsidePackageWithOverriddenMethods extends BaseClass {

    //can't override as it is inaccessible
    //@Override
    private void privateMethod(){
        System.out.println("Private method of class SubClass");
    }

    @Override
    protected void protectedMethod(){
        System.out.println("Protected method of class SubClass");
    }

    /*
     * We can't create default method inside a class
     * */
//    default void defaultMethod(){
//        System.out.println("Default method of class First");
//    }

    @Override
    public void publicMethod(){
        System.out.println("Public method of class SubClass");
    }

    @Override
    void defaultMethod(){
        System.out.println("Default method of class SubClass");
    }

    public static void main(String[] args) {
        BaseClass subclass = new SubClassInsidePackageWithOverriddenMethods();
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
