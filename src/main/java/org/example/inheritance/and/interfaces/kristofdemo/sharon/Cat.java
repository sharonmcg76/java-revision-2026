package org.example.inheritance.and.interfaces.kristofdemo.sharon;

public class Cat extends Animal {

    private String name;
    private String color;
    private String gender;
    private String breed;


    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return
                "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
