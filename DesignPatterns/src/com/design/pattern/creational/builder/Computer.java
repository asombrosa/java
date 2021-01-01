package com.design.pattern.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Computer {

    //required Parameters
    private String HDD;
    private String RAM;

    //Optional Parameters
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
    }

    //Builder Class
    public static class ComputerBuilder {
        //required Parameters
        private String HDD;
        private String RAM;

        //Optional Parameters
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicCard(Boolean graphicCard) {
            this.isGraphicCardEnabled = graphicCard;
            return this;
        }

        public ComputerBuilder setBluetooth(Boolean bluetooth) {
            this.isBluetoothEnabled = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
