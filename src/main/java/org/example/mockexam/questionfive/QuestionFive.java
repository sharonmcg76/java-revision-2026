package org.example.mockexam.questionfive;

public class QuestionFive {

    public static void main(String[] args) {
        Node t = new Node(20,
                    new Node(21,
                        new Node(22),
                        new Node(21)),
                    new Node(23,
                        null,
                        new Node(21)));

        System.out.println(t.countNodesWith(21));
    }

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


//Question 5                        (25 marks)
//Criteria	                        Marks
//Correct method header	            2
//Initializes result	            2
//Checks current node	            4
//Increments result	                2
//Left recursion with null check	5
//Right recursion with null check	5
//Accumulates results	            3
//Returns result	                2