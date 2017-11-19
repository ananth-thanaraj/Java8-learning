package com.java8;

import java.util.stream.Stream;

public class NotOperator {

	public static void main(String[] args) {

		Stream.of("Ananth", ".", "Dhoni")
		.filter(str -> !str.equalsIgnoreCase("Ananth"))
		.forEach(sop -> System.out.println(sop));
				
	}

}
