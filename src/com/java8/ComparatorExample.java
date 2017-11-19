package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorExample {

	static List<String> names = Arrays.asList("Catherine", "Zuul",  "Boot", "Diana", "Xerox", "Ananth","Yml");
	static List<Integer> numbs = Arrays.asList(99,44,77,66,88,22,55,33,11);

	public static void main(String[] args) {

		System.out.println("Comparator using Java 7:");
		System.out.println(names);
		Comparator<String> byName = new Comparator<String>(){

			@Override
			public int compare(String a1,String a2 ){				
				return a1.compareTo(a2);
			}

		};

		Collections.sort(names, byName);
		System.out.println(names);
		
		Comparator<Integer> numberSort = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		};
		Collections.sort(numbs,numberSort);
		System.out.println(numbs);
		
		System.out.println("====================== Compaarator using Java8 ====================");
		
		List sortedNames =names.stream()
			 .sorted(Comparator.naturalOrder())
			 .collect(Collectors.toList());
		System.out.println("Sorted names in the list :" +sortedNames);
		
		List reverseNames = names.stream()
								.sorted(Comparator.reverseOrder())
								.collect(Collectors.toList());
		System.out.println("Names sorted in reverse order: " +reverseNames);
		
		List numbers = numbs.stream()
			.sorted((n1,n2) -> Integer.compare(n2, n1))
			.collect(Collectors.toList());
		System.out.println(numbers);
		
	}

}
