package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {
	
	static List<Person> person = Arrays.asList(
								new Person("Ananth", 26, Arrays.asList(97, 96)),
								new Person("Dhoni", 35, Arrays.asList(77,88)),
								new Person("Kohli", 29, Arrays.asList(18,19))
								);
	
	
	
	public static void main(String[] args) {
		
		List<Integer> phn = person.stream()
				.filter(p -> p.getName().equals("Dhoni"))
				.map(ph -> ph.getPhNo())
				.flatMap(List::stream)				
				.collect(Collectors.toList());
		
		System.out.println(phn);

		
		Map<String, Integer> map = person.stream()
										.collect(Collectors.toMap(Person::getName, Person::getAge));
		
		System.out.println(map);
	}
	
	
static class Person{
	
	private String name;
	private int age;
	private List<Integer> phNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getPhNo() {
		return phNo;
	}
	public void setPhNo(List<Integer> phNo) {
		this.phNo = phNo;
	}
	public Person(String name, int age, List<Integer> phNo) {
		super();
		this.name = name;
		this.age = age;
		this.phNo = phNo;
	}
	
	
}

}
