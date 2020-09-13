package com.home.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThenMethodTest {

	public static void main(String[] args) {

		BiFunction<String, Integer, Integer> biFunction = (designation, age) -> getSalaryByAgeAndDesignation(designation, age);
		
		Integer salary = biFunction.apply("Manager", 32);
		System.out.println(salary);
		salary = biFunction.apply("Developer", 28);
		System.out.println(salary);
		
		System.out.println("-------");
		
		Function<Integer, String> function= sal->getDesignationBasedOnSalary(sal);
		
		String post1 = biFunction.andThen(function).apply("Manager", 32);
		System.out.println(post1);
		String post2 = biFunction.andThen(function).apply("Developer", 28);
		System.out.println(post2);
	}

	private static String getDesignationBasedOnSalary(Integer sal) {
		if(sal>11000)
			return "Manager";
		else if(sal>10000)
			return "Developer";
		else
			return "peon";
	}

	private static Integer getSalaryByAgeAndDesignation(String designation, Integer age) {
		if (designation != null && age != null) {
			if (designation.equalsIgnoreCase("Manager") && age > 30) {
				return 12000;
			} else if (designation.equalsIgnoreCase("Developer") && age > 25) {
				return 10000;
			} else
				return 0;
		} else {
			return 0;
		}
	}
}
