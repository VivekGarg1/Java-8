package com.home.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8ComparatorTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 23));
		empList.add(new Employee("Paras", 24));
		empList.add(new Employee("Prabhat", 25));
		empList.add(new Employee("Shubham", 26));
		empList.add(new Employee("Harish", 27));
		System.out.println("Before sorting");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("--------------------------");
		Collections.sort(empList, (e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("After sorting");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
