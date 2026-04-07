//package org.example.sp2pastpaperjan24.q2b;
//
//public class Q2b {
//
//import java.util.Scanner;
//
//    public static int countIntsBirkbeck(int n) {
//        if (n < 0) {
//            return n;
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter " + n + " words.");
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            String token = sc.next();
//            try {
//                Integer.parseInt(token);
//                count++;
//            } catch (NumberFormatException e) {
//                // not an int, do nothing
//            }
//        }
//        return count;
//    }
//
//}
