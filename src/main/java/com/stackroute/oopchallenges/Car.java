package com.stackroute.oopchallenges;

public class Car extends Vehicle {

    public int wheels;
    public int headlights;

    public Car(String name, int doors, double weight, int wheels, int headlights) {

        super(name, doors, weight);
        this.wheels = wheels;
        this.headlights = headlights;
    }

    public void handSteering(char direction) {
        switch (direction) {
            case 'R':
                System.out.println("Car is turning right");
                break;
            case 'L':
                System.out.println("Car is turning left");
                break;

            default:
                System.out.println("Car is not taking a turn.");
                break;
        }

    }


    public void gearChange(char gear) {
        switch (gear) {
            case 'R':
                System.out.println("Car is in reverse.");
                break;
            case '1':
                System.out.println("Car is in first gear.");
                break;
            case '2':
                System.out.println("Car is in second gear.");
                break;

            default:
                System.out.println("No change in gear.");
                break;
        }

    }

    public void Accelerate(int iSpeed) {
        iSpeed = iSpeed + 5;
        System.out.println("Speed is now " + iSpeed);
    }

    public void Decelerate(int iSpeed) {
        iSpeed = iSpeed - 5;
        System.out.println("Speed is now " + iSpeed);
    }

    public void startVehicle() {
        System.out.println("Started Vehicle");
        super.startVehicle();
    }
}
