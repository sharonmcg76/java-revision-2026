package org.example.inheritance.and.interfaces.sharon.sharon;

public class Cat extends Animal {

    private int numberOfLives;

    public Cat(String breed, String name, String color, String gender, int numberOfLives) {
        super(breed, name, color, gender);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void makeSound() {
        System.out.println("Cat goes Meow");
    }

    @Override
    public String toString() {
        return
                "Cat{" +
                        "breed='" + getBreed() + '\'' +
                        ", name='" + getName() + '\'' +
                        ", color='" + getColor() + '\'' +
                        ", gender='" + getGender() + '\'' +
                        ", lives='" + this.numberOfLives + '\'' +
                        '}';
    }
}
