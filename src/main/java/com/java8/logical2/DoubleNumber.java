package com.java8.logical2;

import com.java8.logical1.StaticData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleNumber {
    //Get Doubled numbers from list
    public static void main(String[] args) {
        List<Integer> numbers = StaticData.getNumbers();
        System.out.println("Before filter numbers in list : "+numbers);

        // By java 7
        List<Integer> l1 = new ArrayList<>();
        for(Integer num : numbers) {
                l1.add(num*2);
        }
        System.out.println("After multiply Java 7  numbers : "+l1);

        //By java 8
        List<Integer> l2 = numbers.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println("After Multiply by Java 8 Streams numbers : "+l2);
    }
}
