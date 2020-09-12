package com.home.lambda.expresson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InstanceMethodLambdaReferenceClient {
 
	public static void main(String[] args) {
		
		//Lambda-Reference to an instance method of an   arbitrary object 
		
		System.out.println("Lambda-Reference to an instance method of an arbitrary object ");
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Vivek Garg", 23));
		studentList.add(new Student("Prabhat", 25));
		studentList.add(new Student("Paras", 25));
		studentList.add(new Student("Shubham", 27));
		
		List<String> personNameList = InstanceMethodLambdaReferenceClient.getStudentNameList(studentList,Student::getName);
		personNameList.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------");
		
		//Lambda-Reference to an instance method of a particular object
		
		System.out.println("Lambda-Reference to an instance method of a particular object");
		List<String> names=new ArrayList<String>();
		names.add("Vivek Garg");
		names.add("Paras");
		names.add("Sagar");
		names.add("Shubham");
		names.add("Santosh");
		names.forEach(name->System.out.println(name));
		//Using method reference
		System.out.println("----------------------------------------------------------------");
		names.forEach(System.out::println);
		
	}

	private static List<String> getStudentNameList(List<Student> studentList,  Function<Student, String> f) {
		List<String> results=new ArrayList<String>();
		studentList.forEach(x->results.add(f.apply(x)));
		return results;
	}

}
