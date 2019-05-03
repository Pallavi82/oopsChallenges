package com.stackroute.oopchallenges;

public class HondaCity extends Car {

    private double BatteryCharge;

    public HondaCity(double BatteryCharge, String name, int doors, double weight, int wheels, int headlights) {

        super(name, doors, weight, wheels, headlights);
        this.BatteryCharge = BatteryCharge;
    }


    public void startVehicle() {
        System.out.println("started Vehicle");
        super.startVehicle();
    }

    public double getMaxBatteryCharge() {
        return BatteryCharge;
    }
}
