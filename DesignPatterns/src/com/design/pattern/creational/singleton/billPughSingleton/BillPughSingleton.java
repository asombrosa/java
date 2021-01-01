package com.design.pattern.creational.singleton.billPughSingleton;

/*
 SingletonHelper class is not loaded into memory and only
 when someone calls the getInstance method, this class gets
 loaded and creates the Singleton class instance.
 */
public class BillPughSingleton {
    private BillPughSingleton(){

    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE
                = new BillPughSingleton();
        private static BillPughSingleton getInstance(){
            return INSTANCE;
        }
    }
}
