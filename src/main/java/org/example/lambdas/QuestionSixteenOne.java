package org.example.lambdas;

import java.util.function.DoubleUnaryOperator;

public class QuestionSixteenOne {
}
//Recall that a functional interface is an interface that contains exactly one abstract method. Consider
//the functional interface DoubleUnaryOperator from package java.util.function. This interface has
//the abstract method double applyAsDouble(double). We have written the following class:
//        1 import java.util.function.DoubleUnaryOperator;
//2
//        3 /**
// 4 * Provides a method to apply a DoubleUnaryOperator repeatedly.
// 5 */
//        6 public class DoubleRepeater {
//7
//        8 /**
// 9 * Returns the result of applying op max(n, 0) times to d.
// 10 *
// 11 * @param op the DoubleUnaryOperator to be applied
// 12 * @param d a value to which op should be applied repeatedly
// 13 * @param n the number of times op should be applied to d
// 14 * @return the result of applying op max(n, 0) times to d
// 15 * @throws NullPointerException if op is null
// 16
//
// 17 public static double repeat(DoubleUnaryOperator op, double d, int n) {
//double result = d;
//for (int i = 0; i < n; i++) {
//result = op.applyAsDouble(result);
//return result;
//Complete the following code according to the comments.
//1 public class DoubleRepeaterDriver {
//2 public static void main(String[] args) {
//3 final double INPUT = 256;
//4 final int TIMES = 3;
//5
//8
//10 11
//12 13 14 }
//15 }
//6 // lambda expression for two times the number
//7 System.out.println(DoubleRepeater.repeat(/* TODO */, INPUT, TIMES));
//9 // Math.sqrt via lambda
//System.out.println(DoubleRepeater.repeat(/* TODO */, INPUT, TIMES));
/// / Math.sqrt via method reference (no ->)
//System.out.println(DoubleRepeater.repeat(/* TODO */, INPUT, TIMES));
//The expected output is:
//2048.0
//2.0
//2.0