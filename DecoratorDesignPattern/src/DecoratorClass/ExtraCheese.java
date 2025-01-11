package org.example.DecoratorClass;

import org.example.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    private int toppingCost = 10;
    BasePizza basePizza;

    @Override
    public int cost() {
        return basePizza.cost() + this.toppingCost;
    }

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
