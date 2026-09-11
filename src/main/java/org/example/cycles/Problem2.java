package org.example.cycles;

// print even numbers from 1 to 50 using for loop

public class Problem2 {
    static void main() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
