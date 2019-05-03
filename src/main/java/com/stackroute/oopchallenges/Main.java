package com.stackroute.oopchallenges;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("HondaCity", 4, 70, 4, 2);

        System.out.println(car.getDoors());
        car.startVehicle();
        car.handSteering('l');
        car.gearChange('N');
        car.Accelerate(45);
        car.Decelerate(50);

        HondaCity hondaCity = new HondaCity(3000,"HondaCity",4,70,4,2);

        System.out.println(hondaCity.getDoors());
        System.out.println(hondaCity.getName());

        hondaCity.Decelerate(84);

        System.out.println(hondaCity.getWeight());

        hondaCity.startVehicle();


    }
}
