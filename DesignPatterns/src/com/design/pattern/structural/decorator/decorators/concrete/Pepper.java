package com.design.pattern.structural.decorator.decorators.concrete;

import com.design.pattern.structural.decorator.components.Pizza;
import com.design.pattern.structural.decorator.decorators.CondimentsDecorator;

public class Pepper extends CondimentsDecorator {
    Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " pepper";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
