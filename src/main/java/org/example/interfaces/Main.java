import org.example.interfaces.Animal;
import org.example.interfaces.Bird;
import org.example.interfaces.Cat;
import org.example.interfaces.Dog;

import java.util.ArrayList;
import java.util.List;

void main() {
    Dog dog1 = new Dog("Daisy", 8, "Female","Cocker");
    Dog dog2 = new Dog("Chilli", 4, "Male", "Cavalier");
    Dog dog3 = new Dog("Pixie", 2, "Female", "Schnauzer");
    Dog dog4 = new Dog("Maisie", 11, "Female", "Cocker");

    Cat cat1 = new Cat( "Siamese","Whiskers", 3, "Female");
    Cat cat2 = new Cat("Tabby", "Herbie", 20, "Female");
    Bird bird1 = new Bird("Joey",1, "male", "Budgie");
    Bird bird2 = new Bird("Bob", 25, "male", "Parrot");


    List<Animal> animals = new ArrayList<>();
    animals.add(dog1);
    animals.add(dog2);
    animals.add(dog3);
    animals.add(dog4);
    animals.add(cat1);
    animals.add(cat2);
    animals.add(bird1);
    animals.add(bird2);


    System.out.println(animals);


    Animal oldest = animals.get(0); //  oldest dog variable is first in list
    for (Animal animal : animals) {
        if (animal.getAge() > oldest.getAge()) {
            oldest = animal;
        }
    }
    System.out.println("Oldest animal is " + oldest);

    for (int i = 0; i < animals.size(); i++) {
        System.out.println(animals.get(i).makeSound());

    }
}