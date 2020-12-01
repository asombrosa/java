package com.design.pattern.creational.singleton.destroyingSingletonPattern;

import com.design.pattern.creational.singleton.eagerInitialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

public class SingletonDestroyUsingReflection {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1
                = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;
        try {
            Constructor[] constructors
                    = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor: constructors){
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
