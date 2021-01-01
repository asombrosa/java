package com.design.pattern.creational.builder;

public class Runner {
    public static void main(String[] args) {
        Computer computer =
                new Computer.ComputerBuilder("1 TB", "8 GB")
                        .setBluetooth(true)
                        .build();
        System.out.println(computer);

    }
}
