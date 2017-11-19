package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
	
	static List<String> names = Arrays.asList("Catherine", "Zuul",  "Boot", "Diana", "Xerox", "Ananth","Yml");
	static List<Integer> numbs = Arrays.asList(99,44,77,66,88,22,55,33,11);
	
	public static void main(String[] args) {
		
		Spliterator<String> splitr = names.spliterator();
		
		Spliterator<String> splitr2 = splitr.trySplit();
		
		splitr2.forEachRemaining(sys -> System.out.println(sys));
		System.out.println("=========================================");
		splitr.forEachRemaining(sys -> System.out.println(sys));
		System.out.println("=========================================");		
		names.stream().forEach(sys -> System.out.println(sys));
		System.out.println("===========================================");
		names.parallelStream().forEach(sys -> System.out.println("Parallel stream output: "+sys));
		
		names.stream()
				.reduce((s1,s2) -> s1 + ":" +s2)
				.ifPresent(System.out::println);
		
	}

}
