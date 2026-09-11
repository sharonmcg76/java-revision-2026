package org.example.cycles;

import java.util.Scanner;

public class Problem3 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int input = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= input; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
