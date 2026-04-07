package org.example.interfaces;

public class Cat extends Animal {

    private String breed;


    public Cat(String breed, String name, int age, String gender) {
        super(name,age,gender);

        this.breed = breed;


    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    public String toString() {
        return super.toString() + ", " + breed;
    }

}
