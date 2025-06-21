package com.lld.LowLevelDesign.Decorator;

public class ExtractCheese extends  ToppingDecorator{
    BasePizza basePizza;
    public ExtractCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 10;
    }
}
