package org.example.mockexam.questiontwo;

public class Counter {
    private int count;

    //conveniently, instance variables of type int are initialized to 0 by
    //   default, so we do not need an explicit constructor in this case

    public void reset() {
        count = 0;
    }
    public void click() {
        count++;
    }
    public int getCount() {
        return count;
    }
    // - getCount() must be used to read from count since count is private
//   (so maxCount = count; would lead to a compile-time error)

    @Override
    public String toString() {
        return "the count is " + count;
    }
}


//private field count of type integer is declared
//methods reset, click and getCount are declared
//toString is declared
//
// @Override to prevent hashCode and equals from being overridden
//counter is the parent class