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

//Question 1                    (5 marks)
//Criteria	                    Marks	    Notes
//Valid pair (a, b)	            1	        Example: (1, 0)
//a > 0	                        2	        Loop must start
//b <= 0 or correct reasoning	2	        Ensures loop does not terminate


