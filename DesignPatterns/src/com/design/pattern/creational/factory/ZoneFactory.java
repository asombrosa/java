package com.design.pattern.creational.factory;

public class ZoneFactory {
    String zoneId;

    public ZoneFactory(String zoneId) {
        this.zoneId = zoneId;
    }

    public Zone createZone() {
        return switch (zoneId) {
            case "US/Pacific" -> new ZonePacific();
            case "US/Mountain" -> new ZoneMountain();
            case "US/Central" -> new ZoneCentral();
            case "US/Eastern" -> new ZoneEastern();
            default -> null;
        };
    }
}