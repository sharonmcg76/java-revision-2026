package org.example.cycles;

import java.util.Scanner;

public class Problem4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int input = scan.nextInt();

        int factorial = 1;

        for (int i = 1; i <= input; i++){
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}

//recursive??