package org.example.lambdas;

import java.util.List;

@FunctionalInterface
public interface DoubleNumberList {
    List <Integer> doubleList(List<Integer> numbers);
}
