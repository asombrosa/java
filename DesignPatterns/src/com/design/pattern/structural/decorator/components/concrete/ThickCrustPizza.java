package com.design.pattern.structural.decorator.components.concrete;

import com.design.pattern.structural.decorator.components.Pizza;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        setDescription("Thick Crust Pizza");
    }

    @Override
    public double getCost() {
        return 500;
    }
}
