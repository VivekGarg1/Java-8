package com.home.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReductionCollectClient {

	public static void main(String[] args) {

		List<Student> stulist = Arrays.asList(new Student("Vivek Garg", 23), new Student("Prabhat", 26),
				new Student("Paras", 24), new Student("Shubham", 26), new Student("Avinash", 24));

		List<String> collect = stulist.stream().map(Student::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("--------------");

		// reduce to String
		String collect2 = stulist.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect2);
		System.out.println("--------------");

		// Calculate average age
		Double collect3 = stulist.stream().collect(Collectors.averagingInt(Student::getAge));
		System.out.println(collect3);
		System.out.println("--------------");

		// Summarizing age
		IntSummaryStatistics collect4 = stulist.stream().collect(Collectors.summarizingInt(Student::getAge));
		System.out.println(collect4);
		System.out.println("--------------");

		//Students Group By age
		Map<Integer, List<Student>> collect5 = stulist.stream().collect(Collectors.groupingBy(Student::getAge));
		System.out.println(collect5);
		System.out.println("--------------");
		collect5.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println("--------------");
		
		//Divide streams elements into groups according to some predicate
		Map<Boolean, List<Student>> collect6 = stulist.stream().collect(Collectors.partitioningBy(p->p.getAge()>23));
		System.out.println(collect6);
		System.out.println("--------------");
		collect6.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println("--------------");
		
		//pushing the collector to perform additional transformation
		Set<Student> collect7 = stulist.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect7.forEach(System.out::println);
	}

}
