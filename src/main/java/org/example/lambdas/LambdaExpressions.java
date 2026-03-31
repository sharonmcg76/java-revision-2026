package org.example.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(54);
        list.add(43);
        list.add(99);
        list.add(234);
        list.add(9);
        list.add(12);
        System.out.println(list);

        Multiplier multiplier = (x,y) -> x*y;
        List<Integer> doubleNumbers = list.stream().map(number-> multiplier.multiply(number,2)).toList();
        System.out.println(doubleNumbers);

        DoubleNumberList doubleNumberFunctionalInterface = (numbers) -> numbers.stream().map(number-> number*2).toList();
        System.out.println(doubleNumberFunctionalInterface.doubleList(list));
    }

}
