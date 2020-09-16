package com.home.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReversalOrderComparingTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 23));
		empList.add(new Employee("Paras", 24));
		empList.add(new Employee("Prabhat", 25));
		empList.add(new Employee("Harish", 27));
		empList.add(new Employee("Shubham", 35));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		empList.sort(comparator);
		empList.forEach(System.out::println);
		System.out.println("-----------------------------");
		empList.sort(comparator.reversed());
		empList.forEach(System.out::println);
		
	}

}
