package org.example.mockexam.questiontwo;

//Fragment is supposed to have the output below
//MaxCounter stores the largest number of clicks before the counter is reset,
//write any additional relevant methods and override the methods for which this is necessary (and no others)
//use the annotation @Override for all methods where this is possible.
//output should be

//the count is 0 and the maximum was 2
//the count is 2 and the maximum was 2
//the count is 0 and the maximum was 2
//the count is 1 and the maximum was 2
//the count id 3 and the maximum was 3

public class MaxCounter extends Counter {
    private int maxCount = 0;
// do NOT add a repeated instance variable count in MaxCounter; it is already
//   present in Counter??

   @Override
    public void reset() {
        if (getCount() > maxCount) { //getter method as private
            maxCount = getCount();  //update maxCount if getCount() is greater than maxCount
        }
        super.reset(); //calling from counter class

//Check with Kristoff?? Carsten said ??
// - do NOT write a method like
//
//       public void reset() {
//           super.reset();
//       }
//
//   it does not add anything over the inherited method, except confusion on
//   the side of the programmer who sees the overridden method???


   }
    @Override  // need to change maxCount, not just count
    public void click() {
        super.click();
        //super.click() must be used to increment count since count is private
        //   (and the responsibility of the superclass)
        if (getCount() > maxCount) { //getter method as private
            maxCount++;  // maxCount = getCount();??
        }
    }

    @Override
    public String toString() {
        return "the count is " + getCount() + " and the maximum was " + maxCount;
    }
    //return super.toString() + " and the maximum was " + maxCount;
    // - toString() could be implemented using getCount() as well
}



