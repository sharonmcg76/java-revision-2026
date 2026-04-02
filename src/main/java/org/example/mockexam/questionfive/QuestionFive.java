package org.example.mockexam.questionfive;

public class QuestionFive {
}

//
//Question 5
//
//public int countNodesWith(int d) {
//    int result = 0;
//    if (d == data) {
//        result++;
//    }
//    if (left != null) {
//        result += left.countNodesWith(d);
//    }
//    if (right != null) {
//        result += right.countNodesWith(d);
//    }
//    return result;
//}

// Notes:
//
// - This question is relatively straightforward. It is important to remember
//   that when we are writing an instance method, we can assume that 'this'
//   object is not the null reference (otherwise the method would not be run).
//
// - The references left and right may or may not be null, so we must check
//   that explicitly before we call a method on them and make the method call
//   only if the reference is not null
