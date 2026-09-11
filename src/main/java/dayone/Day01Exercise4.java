package dayone;

import java.util.Scanner;

public class Day01Exercise4 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non zero, positive integer!");
        int input = scan.nextInt();

        boolean isPrime = true; //fix bug for 3 being prime number

        for (int i = 2; i <= Math.sqrt(input); ++i) {
            isPrime = input % i != 0;
        }
        if (isPrime) {
            System.out.println("Your number is prime!");
        } else {
            System.out.println("Your number is not prime!");
        }
    }
}
