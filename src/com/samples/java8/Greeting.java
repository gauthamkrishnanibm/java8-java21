package com.samples.java8;

public interface Greeting {
	// A default method in the interface
	default void greet() {
		System.out.println("Hello, from the interface!");
	}
}
