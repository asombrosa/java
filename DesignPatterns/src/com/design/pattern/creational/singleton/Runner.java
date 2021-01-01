package com.design.pattern.creational.singleton;

import com.design.pattern.creational.singleton.eagerInitialization.EagerInitializedSingleton;
import com.design.pattern.creational.singleton.lazyInitialization.LazyInitialization;
import com.design.pattern.creational.singleton.staticBlockInitialization.StaticBlockInitialization;
import com.design.pattern.creational.singleton.threadSafe.ThreadSafeSingleton;

public class Runner {
    public static void main(String[] args) {
        System.out.println("---------EAGER INITIALIZATION--------");
        EagerInitializedSingleton eagerInitializedSingletonInstance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingletonInstance2 = EagerInitializedSingleton.getInstance();
        System.out.println("HashCode of instance 1 : " + eagerInitializedSingletonInstance1.hashCode());
        System.out.println("HashCode of instance 2 : " + eagerInitializedSingletonInstance2.hashCode());
        System.out.println("---------STATIC BLOCK INITIALIZATION--------");
        StaticBlockInitialization staticBlockInitializationInstance1 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization staticBlockInitializationInstance2 = StaticBlockInitialization.getInstance();
        System.out.println("HashCode of instance 1 : " + staticBlockInitializationInstance1.hashCode());
        System.out.println("HashCode of instance 2 : " + staticBlockInitializationInstance2.hashCode());
        System.out.println("---------LAZY INITIALIZATION--------");
        LazyInitialization lazyInitializationInstance1 = LazyInitialization.getInstance();
        LazyInitialization lazyInitializationInstance2 = LazyInitialization.getInstance();
        System.out.println("HashCode of instance 1 : " + lazyInitializationInstance1.hashCode());
        System.out.println("HashCode of instance 2 : " + lazyInitializationInstance2.hashCode());
        System.out.println("---------THREAD SAFE INITIALIZATION--------");
        ThreadSafeSingleton threadSafeSingletonInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingletonInstance2 = ThreadSafeSingleton.getInstance();
        System.out.println("HashCode of instance 1 : " + threadSafeSingletonInstance1.hashCode());
        System.out.println("HashCode of instance 2 : " + threadSafeSingletonInstance2.hashCode());

    }
}
