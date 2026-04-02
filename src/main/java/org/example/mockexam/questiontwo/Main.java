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


// Question 2 (25 marks)
//Criteria	                Marks	Notes
//Correct class header	    2	Extends Counter
//Declares maxCount	        2	private int maxCount
//Override click()	        4
//Uses super.click()	    4
//Correct max update logic	5
//Uses getCount()	        3
//Override toString()	    3
//Uses super.toString()	    2