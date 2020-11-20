package com.design.pattern.structural.decorator.decorators.concrete;

import com.design.pattern.structural.decorator.components.Pizza;
import com.design.pattern.structural.decorator.decorators.CondimentsDecorator;

public class Cheese extends CondimentsDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
