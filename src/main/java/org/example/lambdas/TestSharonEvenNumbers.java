package org.example.lambdas;

import java.util.*;
import java.util.function.Predicate;

public class TestSharonEvenNumbers {

    public static void main(String args[]) {

        List<Integer> myNumbers = new ArrayList<>();

        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);

        Predicate<Integer> isEven = myNumber -> myNumber % 2 == 0;

        List<Integer> evenNumbers = myNumbers.stream().filter(isEven).toList();

        System.out.println(evenNumbers);
    }
}