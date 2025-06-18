package com.lld.LowLevelDesign.StrategyDesignPattern;

public class SportyVehicle extends Vehicle{
   public SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
