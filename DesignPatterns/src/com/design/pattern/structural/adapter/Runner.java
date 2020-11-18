package com.design.pattern.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        Duck duck = new DroneAdapter(drone);
        testDuck(duck);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
