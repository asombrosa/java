package com.design.pattern.creational.singleton.staticBlockInitialization;

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {

    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
