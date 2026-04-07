package org.example.interfaces;

public class Dog extends Animal {
    private String breed;
    //constructor
    //this. keyword is for calling methods and fields from inside this class (Dog class)
    //super keyword is for calling methods and fields from the parent (super)class, (Animal class)
    //super() is for calling the constructor from the parent class
    public Dog(String name, int age, String gender, String breed) {
        super(name,age,gender);//call fields or methods from inside class, no need for this.
        this.breed = breed;


    }

    //getters and setters now from animal class

    //access modifier is almost always public.
    //return type is always the type of the field that you are creating the getter for i.e. String, int
    //naming convention always start with getField
    //parameter list is always empty () because we dont need anything from outside the class.
    //in the body of the getter method, we just simply return the field.
    public String getBreed() {
        return breed;
    }
    //access modifier is almost always public
    //void means nothing is returned from this method i.e. dont get info back
    //naming convention is setField
    //parameter list has one parameter which holds the new value that we want to set
    //in the body of the setter method we assign the new value to our field

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    //How to create a string from my object i.e override the inherited (hashcode) tostring
    public String toString() {
        return super.toString() + ", " + breed;
    }
}
