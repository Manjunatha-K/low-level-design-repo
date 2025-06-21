package com.lld.LowLevelDesign.Decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtractCheese(new MargritaPizza()));
        System.out.println(pizza.cost());

    }
}
