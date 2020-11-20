package com.design.pattern.structural.decorator.decorators;

import com.design.pattern.structural.decorator.components.Pizza;

public abstract class CondimentsDecorator extends Pizza {
    public abstract String getDescription();
}
