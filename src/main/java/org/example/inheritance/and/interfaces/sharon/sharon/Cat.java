package org.example.inheritance.and.interfaces.sharon.sharon;

public class Cat extends Animal {

    private String name;
    private String color;
    private String gender;
    private String breed;

    public Cat (String breed, String name, String color, String gender) {
        super(breed, name, color, gender);
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }



    public void makeSound() {
        System.out.println("Cat goes Meow");
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
