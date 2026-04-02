package org.example.mockexam.questionthree;

public class QuestionThree {


//    Question 3
//
//    public static boolean m(List<Integer> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i) >= list.get(i+1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//// Notes:
////
// How to see that this is what the code should do? Think about small inputs:
//   mystery([Z]) => true
//   mystery([Y, Z]) => false for Y >= Z, otherwise true
//   mystery([X, Y, Z]) => false for X >= Y, otherwise mystery([Y, Z]),
//                         i.e., false for X >= Y or Y >= Z, otherwise true
//
// Further notes:
//
// - the given code already provides us with reminders of the List API:
//   there are instance methods size(), get(int), subList(int, int)
//
// - possible exception here: NullPointerException, if list is the null
//   reference or if an element of list is the null reference;
//   these are triggered in the same cases in the original code
//
// - implementation using get(int) may be inefficient for, e.g., LinkedList,
//   but good enough for the PiJ exam setting; a real-world solution would
//   use an iterator or a stream pipeline (perfectly okay here as well, but
//   might take longer to produce)
