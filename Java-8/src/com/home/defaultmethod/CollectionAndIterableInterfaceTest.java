package com.home.defaultmethod;

import java.util.ArrayList;
import java.util.List;

import com.home.functional.interfaces.Employee;

public class CollectionAndIterableInterfaceTest {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 10000.0,"HR"));
		empList.add(new Employee("Prabhat", 16000.0,"HR"));
		empList.add(new Employee("Shubham", 18000.0,"HR"));
		
		empList.add(new Employee("Paras", 13000.0,"Finance"));
		empList.add(new Employee("Ravi",25000.0,"Finance"));
		empList.add(new Employee("Raju", 17000.0,"Finance"));
		
		empList.forEach(s->System.out.println(s));
		
		System.out.println("------------------------------------");
		empList.removeIf(s->s.getDepartment().equalsIgnoreCase("HR"));
		empList.forEach(s->System.out.println(s));
	}
}
