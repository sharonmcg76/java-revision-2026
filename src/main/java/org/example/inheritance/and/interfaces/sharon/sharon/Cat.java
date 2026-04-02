package org.example.inheritance.and.interfaces.sharon.sharon;

public class Cat extends Animal {

    public Cat (String breed, String name, String color, String gender) {
        super(breed, name, color, gender);
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
                '}';
    }
}
