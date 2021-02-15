package com.modular.app;

import com.modular.app.package1.Class1;

public class Runner {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.print();
        /*Class2 class2 = new Class2();
        Unable to import Class2 as it is not exported in the module-info.java
        file of 'Module1'
        Package 'com.modular.app.package2.Class2' is declared in module 'Module1',
        which does not export it to module 'Module2'
         */
    }
}
