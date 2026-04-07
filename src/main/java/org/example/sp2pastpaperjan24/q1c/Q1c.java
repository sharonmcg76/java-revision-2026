package org.example.sp2pastpaperjan24.q1c;

public class Q1c {

//    A static method belongs to the class, not to individual objects. It can be called without creating an object.
//
//    Example:

    public class Maths {
        public static int square(int x) {
            return x * x;
        }
    }
    // Call with:

    Maths.square(5);

    //Consequence: a static method cannot use instance
    // variables directly because there may be no object.




}
