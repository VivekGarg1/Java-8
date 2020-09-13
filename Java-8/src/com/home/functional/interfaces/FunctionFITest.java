package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFITest {

	public static void main(String[] args) {
		
		Function<Integer,String> function=num->"Age is: "+num;
		System.out.println(function.apply(100));
		System.out.println("-------------------");
		
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student("Vivek garg", 23));
		stuList.add(new Student("Paras", 24));
		stuList.add(new Student("Prabhat", 25));
		for (Student student : stuList) {
			System.out.println(student.customShow(s->s.toString()));
		}
		
		System.out.println("--------------------");
		Function<Student,String> functionOne=s-> s.toString();
		for (Student student : stuList) {
			System.out.println(student.customShow(functionOne));
		}
		
		System.out.println("--------------------");
		Function<Student,String> functionTwo=s-> s.toString();
	}
}
