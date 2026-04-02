package org.example.mockexam.questionfour;

import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        StringComparator cmp =
        (string1, string2) -> {
            if (Objects.equals(string1, string2)) {
                return 0;
            } else if (string1 == null) {
                return -1;
            } else if (string2 == null) {
                return 1;
            }
            int len = Integer.compare(string1.length(), string2.length());
            if (len != 0) {
                return len;
            } else {
                return string1.compareTo(string2);
            }
        };

        System.out.println(cmp.compare("bb", null) > 0);
        System.out.println(cmp.compare("bb", "a") > 0);
        System.out.println(cmp.compare("bb", "aa") > 0);
        System.out.println(cmp.compare("bb", "bb") == 0);
        System.out.println(cmp.compare(null, null) == 0);
        System.out.println(cmp.compare("bb", "aaa") < 0);
        System.out.println(cmp.compare("bb", "ccc") < 0);
        System.out.println(cmp.compare(null, "") < 0);
    }
}
//
//Question 4
//
//        (o1, o2) -> {
//        if (o1 == null) {
//        if (o2 == null) {
//        return 0;
//        }
//        return -1;
//        }
//        if (o2 == null) {
//        return 1;
//        }
//        if (o1.length() != o2.length()) {
//        return o1.length() - o2.length();
//    }
//            return o1.compareTo(o2);
//}

// Notes:
//
// - it it up to you whether you add type information for the parameters of
//   the lambda expression
//
// - null inputs must be handled first in the code: instance methods work only
//   if they are called on an instance (i.e., something that is not null)
//
// - the code for "o1 or o2 is null" and the code for "neither o1 nor o2 is null"
//   can be developed independently and then plugged together; so you may well
//   write the second part first and only then think about null

//Question 4 (20 marks)
//Criteria	                Marks
//Lambda structure	        3
//Null handling	            5
//Both null returns 0	    2
//Null ordering	            2
//Length comparison	        4
//Alphabetical tie-break	4