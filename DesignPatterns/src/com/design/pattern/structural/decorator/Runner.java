package com.design.pattern.structural.decorator;

import com.design.pattern.structural.decorator.components.Pizza;
import com.design.pattern.structural.decorator.components.concrete.ThickCrustPizza;
import com.design.pattern.structural.decorator.decorators.concrete.Cheese;
import com.design.pattern.structural.decorator.decorators.concrete.Olives;
import com.design.pattern.structural.decorator.decorators.concrete.Pepper;

public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        pizza = new Cheese(pizza);
        pizza = new Pepper(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.getCost());
    }
}
