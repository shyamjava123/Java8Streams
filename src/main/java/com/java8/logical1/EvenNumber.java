package com.java8.logical1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	// GetEven Numbers by stream API
	public static void main(String[] args) {
		List<Integer> numbers = StaticData.getNumbers();
		System.out.println("Before filter numbers in list : "+numbers);
		
		// By java 7
		List<Integer> l1 = new ArrayList<Integer>();
		for(Integer num : numbers) {
			if(num%2 == 0) {
				l1.add(num);
			}
		}
		System.out.println("After filter Java 7 even numbers : "+l1);
		
		//By java 8
		List<Integer> l2 = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println("After filter by Java 8 Streams even numbers : "+l2);
	}

}
