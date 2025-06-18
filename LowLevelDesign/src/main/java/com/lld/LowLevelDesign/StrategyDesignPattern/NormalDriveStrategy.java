package com.lld.LowLevelDesign.StrategyDesignPattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive Strategy");
    }
}
