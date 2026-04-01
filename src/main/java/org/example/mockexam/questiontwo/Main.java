package org.example.mockexam.questiontwo;

public class Main {
    public static void main(String[] args) {

        MaxCounter mc = new MaxCounter();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
        mc.reset();
        System.out.println(mc);
        mc.click();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
    }
}


//Question 1
//
//        (1, 0)

// Note (not required for the solution):
// Also other positive int values instead of 1 are possible.

//
//Question 2
//
//public class MaxCounter extends Counter {
//    private int maxCount;
//
//    @Override
//    public void click() {
//        super.click();
//        if (getCount() > maxCount) {
//            maxCount = getCount();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + " and the maximum was " + maxCount;
//    }
//}

// Notes:
//
// - do NOT add a repeated instance variable count in MaxCounter; it is already
//   present in Counter
//
// - conveniently, instance variables of type int are initialised to 0 by
//   default, so we do not need an explicit constructor in this case
//
// - getCount() must be used to read from count since count is private
//   (so maxCount = count; would lead to a compile-time error)
//
// - super.click() must be used to increment count since count is private
//   (and the responsibility of the superclass)
//
// - toString() could be implemented using getCount() as well
//
// - do NOT write a method like
//
//       public void reset() {
//           super.reset();
//       }
//
//   it does not add anything over the inherited method, except confusion on
//   the side of the programmer who sees the overridden method

