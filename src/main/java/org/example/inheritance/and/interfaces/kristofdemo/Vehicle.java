package org.example.inheritance.and.interfaces.kristofdemo;

public class Vehicle implements VehicleFunctionality {
    private String make;
    private String model;
    private int year;

    private int speed;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0; // Initialize speed to 0 when the vehicle is created
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void accelerate() {
        int newSpeed = this.speed + 1; // Increase speed by 1 units
        this.setSpeed(newSpeed); // Update the speed of the vehicle
    }
}
