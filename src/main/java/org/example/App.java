package org.example;

import org.example.warm.up.sept.Person;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person("John Doe", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        Person persontwo = new Person ("sharon", 25);
        System.out.println("Name: " + persontwo.getName());
        System.out.println("Age: " + persontwo.getAge());

        Person personthree = new Person ("Alice");
        System.out.println("Name: " + personthree.getName());
        System.out.println ("Age: " + personthree.getAge());

    }

}
