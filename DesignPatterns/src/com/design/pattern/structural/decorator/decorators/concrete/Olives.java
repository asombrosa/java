package com.design.pattern.structural.decorator.decorators.concrete;

import com.design.pattern.structural.decorator.components.Pizza;
import com.design.pattern.structural.decorator.decorators.CondimentsDecorator;

public class Olives extends CondimentsDecorator {
    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 70;
    }
}
