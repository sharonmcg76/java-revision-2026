package org.example.mockexam.questionone;

//Consider the following Java method:

//Give a pair of numbers (a,b) such that the method call weird(a,b) does not terminate.


public class QuestionOne {
    public static int weird(int x, int y) {
        int r = 0;
        while (x > 0) {
            x-=y;
            // x is declared positive and decrementing.
            // to keep the loop going, y must be zero(x stays same) or negative(x increases)
            r++;
        }
        return r;
    }
}

//        simplest answer is (1, 0)


