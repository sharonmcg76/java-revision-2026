package org.example.mockexam.questionthree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(31);
        numbers.add(21);
        numbers.add(13);
        numbers.add(14);
        System.out.println(numbers);
        System.out.println(numbers.contains(310));
        System.out.println(numbers.indexOf(13));
        System.out.println(numbers.isEmpty());

    }
}
