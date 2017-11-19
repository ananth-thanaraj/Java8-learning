package com.java8;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ananth","Dhoni","Kohli","Sachin","Federer");

		names.stream()
		.filter(FilterExample::isNotName) /* filter implements Predicate interface which takes in an argument and returns a boolean */
		.forEach(System.out::println);
	}

	private static boolean isNotName(String t) {
		return !t.equals("Sachin");
	}

}
