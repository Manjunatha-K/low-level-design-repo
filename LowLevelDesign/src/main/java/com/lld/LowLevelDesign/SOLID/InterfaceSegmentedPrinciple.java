package com.lld.LowLevelDesign.SOLID;

/*
Interface should be such that client should not
implement any Unnecessary functions they do not need
 */
public class InterfaceSegmentedPrinciple {
}

interface restaurantEmployee{
    void washDishes();
    void serveCustomer();
    void cookFood();
}

class Waiter implements restaurantEmployee{

    @Override
    public void washDishes() {
        //Not my Job
    }

    @Override
    public void serveCustomer() {
        System.out.println("Serving customer");
    }

    @Override
    public void cookFood() {
        // Not my Job
    }
}


//Below : code is formated to follow Interface Segmented Principle
interface WaiterInterface{
    void serveCustomer();
    void takeOrder();
}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}

class waiter2 implements WaiterInterface{

    @Override
    public void serveCustomer() {
        System.out.println("Serving...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking Order...");
    }
}

class Chef implements ChefInterface{

    @Override
    public void cookFood() {
        System.out.println("Cooking....");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding....");
    }
}