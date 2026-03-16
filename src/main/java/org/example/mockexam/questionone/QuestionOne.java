package org.example.mockexam.questionone;

public class QuestionOne {
    public static int weird(int x, int y) {
        int r = 0;
        while (x > 0) {
            x-=-y; // x is declared positive and decrementing.  to keep the loop going, y must be negative
            r++;
        }
        return r;
    }
}


//pair of numbers a is positive integer, b is negative integer