package org.example.interfaces;

public class Bird extends Animal {
    private String breed;

    public Bird(String name, int age, String gender, String breed) {
        super(name, age, gender);

        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;

}

    @Override
    public String makeSound() {
        return "Squawk";
    }

    public String toString() {
        return super.toString() + ", " + breed;
    }

}
