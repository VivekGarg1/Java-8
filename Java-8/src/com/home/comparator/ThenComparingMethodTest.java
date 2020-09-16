package com.home.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThenComparingMethodTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 23));
		empList.add(new Employee("Paras", 24));
		empList.add(new Employee("Prabhat", 25));
		empList.add(new Employee("Shubham", 26));
		empList.add(new Employee("Harish", 27));
		empList.add(new Employee("Prabhat", 30));
		empList.add(new Employee("Shubham", 35));
		System.out.println("Before sorting");
		empList.forEach(System.out::println);
		System.out.println("--------------------------");
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		Collections.sort(empList, comparator);
		System.out.println("After sorting");
		empList.forEach(System.out::println);
	}

}
