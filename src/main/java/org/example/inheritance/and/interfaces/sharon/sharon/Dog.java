package org.example.inheritance.and.interfaces.sharon.sharon;

public class Dog extends Animal {

    public Dog(String breed, String name, String color, String gender) {
        super(breed, name, color, gender);
    }

    public void makeSound() {
        System.out.println("Dog goes Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender='" + getGender() + '\'' +
                '}';
    }

}

