package com.home.defaultmethod;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 10000.0,"HR"));
		empList.add(new Employee("Prabhat", 16000.0,"HR"));
		empList.add(new Employee("Shubham", 18000.0,"HR"));
		
		empList.add(new Employee("Paras", 13000.0,"Finance"));
		empList.add(new Employee("Ravi",25000.0,"Finance"));
		empList.add(new Employee("Raju", 17000.0,"Finance"));
		empList.forEach(System.out::println);
		System.out.println("---------------------------------------");
		
		System.out.println("Employee sorted by salary");
		empList.sort((e1,e2)->e1.getSalary()>(e2.getSalary())?1:-1);
		empList.forEach(System.out::println);
		System.out.println("---------------------------------------");
		
		empList.replaceAll(e->{
			if(e.getSalary()>15000.0)
				return e;
			else {
				e.setSalary(e.getSalary()+e.getSalary()*0.1);
				return e;
			}
		});
		empList.forEach(System.out::println);
	}
}
