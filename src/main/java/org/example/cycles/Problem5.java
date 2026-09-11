package org.example.cycles;

import java.util.Scanner;

public class Problem5 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int input = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}