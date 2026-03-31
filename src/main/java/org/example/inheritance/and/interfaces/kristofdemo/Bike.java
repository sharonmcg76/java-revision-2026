package org.example.inheritance.and.interfaces.kristofdemo;

public class Bike extends Vehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        int newSpeed = this.getSpeed() + 10; // Increase speed by 10 units for a bike
        this.setSpeed(newSpeed); // Update the speed of the bike
    }


    @Override
    public String toString() {
        return "Bike{" +
                "make='" + super.getMake() + "\', " + // Call the toString method of the superclass to include its attributes
                "model='" + super.getModel() + "\', " +
                "year='" + super.getYear() + "\', " +
                "speed='" + super.getSpeed() + "\'" +
                '}';
    }
}
