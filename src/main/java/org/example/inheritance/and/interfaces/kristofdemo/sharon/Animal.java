package org.example.inheritance.and.interfaces.kristofdemo.sharon;

public class Animal implements AnimalFunctionality{
    private String breed;
    private String name;
    private String color;
    private String gender;

    public Animal (String breed, String name, String color, String gender) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
