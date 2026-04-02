package org.example.mockexam.questionthree;

import java.util.List;

public class Q3 {
    public static boolean m (List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) { //Start at 0, keep going until the second last element, and move forward one step at a time
            if (list.get(i) >= list.get(i+1)) { //need the minus 1, or get i+1 will crash at final element
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
//this returns true if the integers in the list are in strictly acending order


//LIST API
// list.size() will give numebr of items in the list
// get(i) = one item at position i, get(int) is the method header, get(i) is the method call.
// subList(a, b) = all items from position a up to but not including b
// null pointer exception if list is null or if an element of list is null.
// NB: these are triggered in the same cases in the original code.

// in PIJ, get(int) is used to access elements of the list,
// (this may not be best choice in real world, stream pipeline or iterator better.)