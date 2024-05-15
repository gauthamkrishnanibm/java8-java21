package com.samples.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPISample {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "orange", "grape", "kiwi");
		// Using Stream API to filter and transform elements
        List<String> result = fruits.stream()
            .filter(fruit -> fruit.length() > 5)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(result); // Output: [BANANA, ORANGE]

	}

}
