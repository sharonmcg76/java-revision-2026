package org.example.inheritance.and.interfaces.sharon.sharon;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador", "Max", "Black", "Male");
        System.out.println(dog);
        dog.makeSound();

        Cat cat = new Cat("Persian", "Tom", "White", "Male", 9);
        System.out.println(cat);
        cat.makeSound();

        Cat cat2 = new Cat("Siamese", "Lily", "Tan", "Female", 8);
        System.out.println(cat2);
        cat2.makeSound();

    }

}
 