package com.design.pattern.creational.singleton.eagerInitialization;

/*
Does not have options for exception handling
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton EAGER_INITIALIZATION
            = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return EAGER_INITIALIZATION;
    }
}
