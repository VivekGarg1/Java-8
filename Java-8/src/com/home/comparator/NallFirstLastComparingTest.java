package com.home.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NallFirstLastComparingTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 23));
		empList.add(new Employee("Paras", 24));
		empList.add(new Employee("Prabhat", 25));
		empList.add(new Employee(null, 26));
		empList.add(new Employee("Harish", 27));
		empList.add(new Employee(null, 30));
		empList.add(new Employee("Shubham", 35));
		
		Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Collections.sort(empList, comparator1);
		empList.forEach(System.out::println);
		System.out.println("-----------------------------");
		Comparator<Employee> comparator2 = Comparator.comparing(Employee::getName,Comparator.nullsLast(String::compareTo));
		Collections.sort(empList, comparator2);
		empList.forEach(System.out::println);
	}

}
