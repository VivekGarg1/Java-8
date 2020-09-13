package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BinaryOperatorMinByAndMaxByTest {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Vivek Garg", 10000.0,"HR"));
		empList.add(new Employee("Prabhat", 16000.0,"HR"));
		empList.add(new Employee("Shubham", 18000.0,"HR"));
		
		empList.add(new Employee("Paras", 13000.0,"Finance"));
		empList.add(new Employee("Ravi",25000.0,"Finance"));
		empList.add(new Employee("Raju", 17000.0,"Finance"));
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
		Map<String, Optional<Employee>> maxSalByDeptName = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(comparing))));
		maxSalByDeptName.forEach((department,emp)->{
			System.out.println(department);
			Employee employee = emp.get();
			System.out.println(employee);
		});
		
		System.out.println("------------------------------------");
		Map<String, Optional<Employee>> minSalByDeptName = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.minBy(comparing))));
		minSalByDeptName.forEach((department,emp)->{
			System.out.println(department);
			Employee employee = emp.get();
			System.out.println(employee);
		});
	}

	
}
