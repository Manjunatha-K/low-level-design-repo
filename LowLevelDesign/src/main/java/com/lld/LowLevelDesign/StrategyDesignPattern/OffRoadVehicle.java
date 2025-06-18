package com.lld.LowLevelDesign.StrategyDesignPattern;

public class OffRoadVehicle extends  Vehicle {
  public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
