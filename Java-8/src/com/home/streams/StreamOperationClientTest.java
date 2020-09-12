package com.home.streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.home.lambda.expresson.Student;

public class StreamOperationClientTest {

	public static void main(String[] args) {

		// Operations are:1.Intermediate return Stream<T>,2.Terminal return specific
		// type
		// 3.filtering ,4.Matching,5.Mapping,6.Reduction,7.Collecting

		List<String> list = new ArrayList<>();
		list.add("Vivek");
		list.add("Prabhat");
		list.add("Paras");
		list.add("Prabhat");

		// Intermediate operation
		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();

		// Terminal operation
		long count = distinct.count();
		System.out.println(count);

		// we can perform it by chaining
		// long count2=stream.distinct().count();//it will give exception we can't use
		// stream again
		long count2 = list.stream().distinct().count();
		System.out.println(count2);

		boolean anyMatch = list.stream().anyMatch(a -> a.contains("Paras"));
		System.out.println(anyMatch);

		System.out.println("----------------------------");

		// Filtering
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

		Stream<Student> filter = studentList.stream().filter(f -> f.getAge() > 25);
		filter.forEach(System.out::println);

		System.out.println("----------------------------");

		// Matching
		boolean allMatch = studentList.stream().allMatch(f -> f.getName().contains("a"));
		System.out.println(allMatch);

		System.out.println("----------------------------");
		boolean anyMatch2 = studentList.stream().anyMatch(f -> f.getAge() > 28);
		System.out.println(anyMatch2);

		System.out.println("----------------------------");
		boolean noneMatch = studentList.stream().noneMatch(f -> f.getAge() > 28);
		System.out.println(noneMatch);

		System.out.println("----------------------------");

		// Mapping

		List<String> uris = new ArrayList<>();
		uris.add("C://MyFile1.txt");
		uris.add("D://MyFile2.txt");
		uris.add("C://MyFile3.txt");
		Stream<Path> map = uris.stream().map(uri -> Paths.get(uri));
		map.forEach(System.out::println);

		System.out.println("----------------------------");

		List<Detail> details = new ArrayList<>();

		List<String> part1 = new ArrayList<>();
		part1.add("Part_1");
		part1.add("Part_2");
		part1.add("Part_3");

		List<String> part2 = new ArrayList<>();
		part2.add("Part_1");
		part2.add("Part_2");
		part2.add("Part_3");
		part2.add("Part_4");

		Detail detail1 = new Detail(1, part1);
		Detail detail2 = new Detail(2, part2);
		details.add(detail1);
		details.add(detail2);

		Stream<String> flatMap = details.stream().flatMap(detail -> detail.getParts().stream());
		flatMap.forEach(System.out::println);

		System.out.println("----------------------------");

		// Reduction
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		Integer reduce = intList.stream().reduce(100,(x,y)->x+y);
		System.out.println(reduce);
		
		System.out.println("----------------------------");
		
		//Collecting
		
		List<String> namelist = new ArrayList<>();
		namelist.add("Vivek");
		namelist.add("Prabhat");
		namelist.add("Paras");
		namelist.add("Prabhat");
		List<String> collect = namelist.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
