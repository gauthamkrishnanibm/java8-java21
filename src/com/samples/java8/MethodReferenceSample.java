package com.samples.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "cherry", "apple");
		strings.sort(String::compareToIgnoreCase);
		System.out.println(strings); // Output: [apple, banana, cherry]
	}

}
