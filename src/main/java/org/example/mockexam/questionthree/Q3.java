package org.example.mockexam.questionthree;

import java.util.List;


//Consider the following Java method:
//    public static boolean mystery(List<Integer> list) {
//        if (list.size() < 2) {
//            return true;
//            }
//        if (list.get(0) >= list.get(1)) {
//            return false;
//            }
//        return mystery(list.subList(1, list.size()));
//        }

//Write a method
//    public static boolean m(List<Integer> list)
//
//      that returns the same result as the above method mystery.
//      If mystery throws an exception on an input,
//      your method must throw an object of the same exception type on this input.
//      Your method must not use recursion.
//      However, using streams, using loops,
//      and writing private auxiliary methods are all allowed.
//      Your code must not modify the input list, list.

// Notes
//      if the list has fewer than 2 items, say the list is correct.
//      if the first element is greater than the second, return false.
//      new sublist of all elements except the first one.
//      list.size() is one more than the number of elements.

//  a,b,c,d,e,f     list.size() == 6
//  list.subList(1, list.size()) == list.subList(1,6) == b,c,d,e,f
//    subList(a, b) returns elements at indexes a through b - 1.

public class Q3 {
    public static boolean m(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) { //Start at 0, keep going until the second last element, and move forward one step at a time
            if (list.get(i) >= list.get(i + 1)) { //need the minus 1, or get i+1 will crash at final element
                return false;
            }
        }
        return true;
    }
}

//if for a list of integers, i is greater than or equal to  element i+1, return false
//if there is only one integer in the whole list, then it is always true
//first element on list greater than or equal to second, return false, otherwise return true
//second element on list greater than or equal to the third, return false, otherwise return true
//third element on list greater than or equal to the fourth, return false, otherwise return true
//this returns true if the integers in the list are in strictly ascending order


//LIST API
// list.size() will give number of items in the list
// get(i) = one item at position i, get(int) is the method header, get(i) is the method call.
// subList(a, b) check this
// null pointer exception if list is null or if an element of list is null.
// NB: these are triggered in the same cases in the original code.


//Question 3                (25 marks)
//Criteria	                Marks
//Correct method header 	2
//Correct iteration	        4
//Correct loop bound	    5
//Correct comparison	    6
//Returns false early	    4
//Returns true at end	    2
//Strict increase logic	    2


// in PIJ, get(int) is used to access elements of the list,
// (this may not be best choice in real world, stream pipeline or iterator better.)