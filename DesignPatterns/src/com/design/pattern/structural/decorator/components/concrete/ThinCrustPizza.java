package com.design.pattern.structural.decorator.components.concrete;

import com.design.pattern.structural.decorator.components.Pizza;

public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        setDescription("Thin Crust Pizza");
    }

    @Override
    public double getCost() {
        return 200;
    }
}
