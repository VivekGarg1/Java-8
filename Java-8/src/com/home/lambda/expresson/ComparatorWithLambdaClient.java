package com.home.lambda.expresson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambdaClient {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", "v@gmail.com", 15000.0));
		empList.add(new Employee("Prabhat", "p@gmail.com", 16000.0));
		empList.add(new Employee("Shubham", "s@gmail.com", 17000.0));
		
		System.out.println("List of employee before sorting");
		empList.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		System.out.println("List of employee after sorting using Comprator");
		Collections.sort(empList, new EmployeeNameSorter());
		empList.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		System.out.println("List of employee after sorting using Anonymous Comprator class");
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		empList.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		System.out.println("List of employee after sorting using Lambda");
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		empList.forEach(System.out::println);
	}

}
