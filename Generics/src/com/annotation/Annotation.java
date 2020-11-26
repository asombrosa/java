package com.annotation;

class Base {
    public void display() {
        System.out.println("Base display()");
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("Derived display(int )");
    }

/*    @Override
    public void invalid(){
        System.out.println("invalid");
    }*/
}

public class Annotation {
    public static void main(String args[]) {
        Derived obj = new Derived();
        obj.display();
        //If you try to override display method
        //and pass in parameters it would be compile
        //time error
    }
}
