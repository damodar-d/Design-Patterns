package org.example.DecoratorClass;

import org.example.BasePizza;

public class ExtraMushroom extends ToppingDecorator{

    BasePizza basePizza;
    private int toppingCost = 20;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+this.toppingCost;
    }
}
