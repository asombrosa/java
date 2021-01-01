package com.generics;

//Parametric typed class
//here T is the type parameter
class MyList<T> {
    public void add(T element) {
        System.out.println("adding....");
    }
}

public class GenericClasses {

    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();
        //here 'Integer' is the type argument
        mylist.add(1);
        MyList<String> myListOfString = new MyList<>();
        //here 'String' is the type argument
        myListOfString.add("1");
    }
}
