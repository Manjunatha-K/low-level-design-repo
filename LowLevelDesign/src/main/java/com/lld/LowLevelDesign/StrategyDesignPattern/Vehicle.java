package com.lld.LowLevelDesign.StrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategy;
    //This is known as constructor Injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
