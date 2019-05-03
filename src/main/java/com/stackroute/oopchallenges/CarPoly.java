package com.stackroute.oopchallenges;

public class CarPoly {

    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public CarPoly(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(boolean start) {
        if (start) {
            System.out.println("Engine Started.");
        } else {
            System.out.println("Engine Stopped.");
        }
    }

    public void accelerate(int acc) {
        System.out.println("Accelerating car at " + acc + " Km/h");

    }

    public void brake(boolean applybrake) {
        if (applybrake) {
            System.out.println("Brakes applied.");
        } else {
            System.out.println("Brakes released.");
        }
    }

    public static void main(String[] args) {

        CarPoly carPoly = new CarPoly("HondaCity",2);
        carPoly.startEngine(true);
        carPoly.accelerate(250);
        carPoly.brake(true);
    }
}
