package com.home.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.home.lambda.expresson.Student;

public class ParallelStreamClientTest {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Vivek Garg", 23));
		studentList.add(new Student("Prabhat", 25));
		studentList.add(new Student("Paras", 29));
		studentList.add(new Student("Shubham", 22));
		studentList.add(new Student("Ravi", 25));
		studentList.add(new Student("Harish", 26));
		studentList.add(new Student("Raja", 24));
		studentList.add(new Student("Abhinav", 25));
		studentList.add(new Student("Ram", 26));
		
		Stream<Student> parallelStream = studentList.parallelStream();
		System.out.println("Student data send for processing");
		parallelStream.forEach(p->doProcess(p));
		
		System.out.println("-----------------------------------");
		
		List<Student> stulist = Arrays.asList(new Student("Vivek Garg", 23), new Student("Prabhat", 26),
				new Student("Paras", 24), new Student("Shubham", 26), new Student("Avinash", 27));
		
		//Creating parallel stream from collection
		Stream<Student> parallelStream2 = stulist.parallelStream();
		boolean parallel = parallelStream2.isParallel();
		System.out.println(parallel);
		System.out.println("-----------------------------------");
		boolean anyMatch = parallelStream2.map(student->student.getAge()*2).anyMatch(age -> age>50);
		System.out.println(anyMatch);
		System.out.println("-----------------------------------");
		
		//Creating parallel stream from IntStram,LongStream,DoubleStream
		IntStream intStream = IntStream.range(1,150).parallel();
		boolean parallel2 = intStream.isParallel();
		System.out.println(parallel2);
		System.out.println("-----------------------------------");
		
		//Convert stream from parallel sequential mode
		IntStream sequential = intStream.sequential();
		boolean parallel3 = sequential.isParallel();
		System.out.println(parallel3);
	}

	private static void doProcess(Student p) {
		System.out.println(p);
	}
}
