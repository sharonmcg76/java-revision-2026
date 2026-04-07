package org.example.sp2pastpaerjan23.q4;

import java.util.Scanner;

public class Q4b {



import java.util.Scanner;

    public static void readNumbers() {
        Scanner sc = new Scanner(System.in);
        boolean first = true;
        int previous = 0;

        while (true) {
            System.out.print("Enter the next number (0 to finish): ");

            if (!sc.hasNextInt()) {
                throw new WeirdInputException("Input was not an int");
            }

            int current = sc.nextInt();

            if (current == 0) {
                return;
            }

            if (!first) {
                if (current == previous) {
                    System.out.println("Same");
                } else if (current > previous) {
                    System.out.println("Up");
                } else {
                    System.out.println("Down");
                }
            }

            previous = current;
            first = false;
        }
    }

//Explanation:
//The method repeatedly asks for input.
//If the next token is not an integer, it throws WeirdInputException.
//If the user enters 0, the method finishes.
//For every input after the first,
// it compares the current value with the previous
// one and prints Same, Up, or Down.
}
