package com.design.pattern.creational.factory;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ZoneFactory zoneFactory = new ZoneFactory("US/Central");
        Calendar calendar = new PacificCalendar(zoneFactory);
        List<String> appointments = Arrays.asList("appointment 1", "appointment 2");
        calendar.createCalendar(appointments);
        calendar.print();

        zoneFactory = new ZoneFactory("US/Pacific");
        calendar = new PacificCalendar(zoneFactory);
        appointments = Arrays.asList("appointment 1", "appointment 2");
        calendar.createCalendar(appointments);
        calendar.print();
    }
}
