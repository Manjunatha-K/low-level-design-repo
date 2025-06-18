package com.lld.LowLevelDesign.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportyVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new NormalVehicle();
        vehicle2.drive();
        Vehicle vehicle3 = new OffRoadVehicle();
        vehicle3.drive();
    }
}
