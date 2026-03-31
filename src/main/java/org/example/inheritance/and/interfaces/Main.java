package org.example.inheritance.and.interfaces;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020);
        Car car = new Car("Honda", "Civic", 2021, 4);
        Bike bike = new Bike("Yamaha", "YZF-R3", 2022);
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(bike);
        // Accelerate each vehicle to demonstrate the functionality of the accelerate method defined in the VehicleFunctionality interface
        System.out.println("Accelerating each vehicle...");
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.accelerate();
        car.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(bike);
    }
}
