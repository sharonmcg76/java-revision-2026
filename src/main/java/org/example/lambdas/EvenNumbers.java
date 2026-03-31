package org.example.lambdas;

import java.util.List;
import java.lang.System;

import static java.lang.System.*;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}


