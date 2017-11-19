package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ananth","Dhoni","Kohli","Sachin","Federer");
		
		names.stream()
			.filter(t -> !t.equals("Ananth"))
			.map(User::new) /* Method reference */
			.forEach(System.out::println);
		
		System.out.println("==========================Changing and setting name========================");
		names.stream()
		.filter(t -> t.equals("Ananth"))
		.map(new Function<String, User>() {

					@Override
					public User apply(String t) {
						User user = new User();
						user.setName("Bhuvi");
						return user;
					}

					
		}) /* Map doesn't use Lambda expressing here */
		.forEach(System.out::println);
		
		
		System.out.println("==========================Collecting names in a list========================");
		
		List<User> userList = names.stream()
		.filter(t ->!t.equals("Ananth"))
		.map(User::new)
		.collect(Collectors.toList());
		
		System.out.println(userList);

	}

	}

	


	class User{

		private String name;
		private int age = 26;

		public User(String name) {
			this.name=name;
		}

		public User() {
			
		}
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

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}

	}


