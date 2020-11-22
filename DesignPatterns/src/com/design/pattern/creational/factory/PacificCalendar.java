package com.design.pattern.creational.factory;

import java.util.List;

public class PacificCalendar extends Calendar {

    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone();
    }

    public void createCalendar(List<String> appointments) {
        System.out.println("Making the calendar");
    }
}