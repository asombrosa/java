package com.design.pattern.structural.decorator.components;

public abstract class Pizza {
    String description = "";

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getCost();
}
