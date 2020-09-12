package com.home.lambda.expresson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaWithCollectionClient {

	public static void main(String[] args) {

		// Iterate List Demo
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Vivek Garg", 23));
		studentList.add(new Student("Prabhat", 25));
		studentList.add(new Student("Paras", 25));

		// Iterate list using forEach loop
		studentList.forEach(new MyConsumer());

		// or
		System.out.println("----------------------------------");
		studentList.forEach(s -> System.out.println(s));

		// or
		System.out.println("----------------------------------");
		studentList.forEach(System.out::println);

		// Using enhanced for loop
		System.out.println("----------------------------------");
		for (Student student : studentList) {
			System.out.println(student);
		}

		// Using Iterator
		System.out.println("----------------------------------");
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------------------");

		// Iterate Map Demo
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee("Vivek Garg", "v@gmail.com", 15000.0));
		map.put(2, new Employee("Prabhat", "p@gmail.com", 16000.0));
		map.put(3, new Employee("Shubham", "s@gmail.com", 17000.0));

		// Traditional approach
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("----------------------------------");
		//using keySet
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("----------------------------------");
		//using forEach loop
		map.forEach((k,v)->System.out.println(k+"\t"+v));
	}
}

class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student student) {
		System.out.println(student);
	}

}
