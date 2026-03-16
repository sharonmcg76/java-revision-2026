package org.example.mockexam.questiontwo;

public class MaxCounter extends Counter {
    private int maxCount = 0;

   @Override
    public void reset() {
        if (getCount() > maxCount) { //getter method as private
            maxCount = getCount();  //update maxCount if getCount() is greater than maxCount
        }
        super.reset(); //calling from counter class
    }
    @Override  // need to change maxCount, not just count
    public void click() {
        super.click();
        if (getCount() > maxCount) { //getter method as private
            maxCount++;
        }
    }

    @Override
    public String toString() {
        return "the count is " + getCount() + " and the maximum was " + maxCount;
    }
}


//Fragmetn is supposed to have the output below
// A questiontwo.MaxCounter stores the largest number of clicks before the counter is reset,
//write any additional relevant methods and override the methods for which this is necessary (and no others)
//use the annotation @Override for all methods where this is possible.
//output should be

//the count is 0 and the maximum was 2
//the count is 2 and the maximum was 2
//the count is 0 and the maximum was 2
//the count is 1 and the maximum was 2
//the count id 3 and the maximum was 3