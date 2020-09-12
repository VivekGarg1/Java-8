package com.home.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionClientDemo {

	public static void main(String[] args) {

		// 1+2+3 Accumulator
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduce.getAsInt());
		System.out.println("-----------------");

		int reduce2 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reduce2);
		System.out.println("-----------------");

		Integer reduce3 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("Combiner was called!!!");
			return a + b;
		});
		System.out.println(reduce3);
		System.out.println("-----------------");
		
		
	}

}
