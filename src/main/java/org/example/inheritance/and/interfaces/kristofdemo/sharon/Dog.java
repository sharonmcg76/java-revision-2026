package org.example.inheritance.and.interfaces.kristofdemo.sharon;

public class Dog extends Animal {
    private String breed;
    private String name;
    private String color;
    private String gender;

    public Dog(String breed, String name, String color, String gender) {
        super(breed, name, color, gender);
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public void makeSound() {
        System.out.println("Dog goes Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';

    }

}

