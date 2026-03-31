package org.example.inheritance.and.interfaces;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the constructor of the superclass (Vehicle) to initialize the common attributes
        this.numberOfDoors = numberOfDoors; // Initialize the specific attribute of Car
    }

    @Override
    public void accelerate() {
        int newSpeed = this.getSpeed() + 5; // Increase speed by 5 units for a bike
        this.setSpeed(newSpeed); // Update the speed of the bike
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + super.getMake() + "\', " + // Call the toString method of the superclass to include its attributes
                "model='" + super.getModel() + "\', " +
                "year='" + super.getYear() + "\', " +
                "speed='" + super.getSpeed() + "\'" +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
