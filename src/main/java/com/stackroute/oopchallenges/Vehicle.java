package com.stackroute.oopchallenges;

public class Vehicle {

    public String name;
    public int doors;
    public double weight;

    public Vehicle(String name, int doors, double weight) {

        this.name = name;
        this.doors = doors;
        this.weight = weight;
    }

    public void startVehicle() {
        System.out.println("Vehicle started");
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
    public double getWeight() {
        return weight;
    }

}
