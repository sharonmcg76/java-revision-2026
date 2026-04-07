package org.example.sp2pastpaerjan23.q4;

public class Q4a {

    //A correct unchecked exception class is:

    public class WeirdInputException extends RuntimeException {
        public WeirdInputException() {
            super();
        }

        public WeirdInputException(String message) {
            super(message);
        }
    }


//    Explanation:
//    An unchecked exception is a subclass of RuntimeException.
//    Each constructor calls the corresponding
//    superclass constructor as required.
//
}