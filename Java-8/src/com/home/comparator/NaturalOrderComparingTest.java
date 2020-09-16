package com.home.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderComparingTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 23));
		empList.add(new Employee("Paras", 24));
		empList.add(new Employee("Prabhat", 25));
		empList.add(new Employee("Shubham", 26));
		empList.add(new Employee("Harish", 27));
		empList.add(new Employee("Prabhat", 30));
		empList.add(new Employee("Shubham", 35));
		
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Before sorting");
		nameList.forEach(System.out::println);
		System.out.println("-----------------");
		//Collections.sort(nameList);
		//nameList.sort(Comparator.naturalOrder());
		nameList.sort(Comparator.reverseOrder());
		System.out.println("After sorting");
		nameList.forEach(System.out::println);
	}

}
