package com.lld.LowLevelDesign.Decorator;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost()+299;
    }
}
