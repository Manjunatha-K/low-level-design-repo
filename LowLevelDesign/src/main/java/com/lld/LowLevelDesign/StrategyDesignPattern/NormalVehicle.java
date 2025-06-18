package com.lld.LowLevelDesign.StrategyDesignPattern;

public class NormalVehicle extends Vehicle{
  public  NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
