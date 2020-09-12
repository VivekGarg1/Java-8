package com.home.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicApisClientTest {

	public static void main(String[] args) {

		Stream<String> build = Stream.<String>builder().add("Vivek").add("Paras").add("Prabhat").build();
		build.forEach(System.out::println);

		System.out.println("-------------------------------");

		Stream<Object> build2 = Stream.builder().add("Vivek").add(10).add("Paras").add("Prabhat").build();
		build2.forEach(System.out::println);

		System.out.println("-------------------------------");

		Stream<String> limit = Stream.generate(() -> "Hello").limit(10);
		limit.forEach(System.out::println);

		System.out.println("-------------------------------");

		Stream<Integer> limit2 = Stream.iterate(40, i -> i + 2).limit(10);
		limit2.forEach(System.out::println);

		System.out.println("-------------------------------");

		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);

		System.out.println("-------------------------------");

		IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::println);
		
		System.out.println("-------------------------------");

		Random random=new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		
		IntStream chars = "abcd".chars();
		chars.forEach(System.out::println);
	}

}
