package com.home.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineClientTest {

	public static void main(String[] args) {
		
		Stream<String> onceModifiedStream = Stream.of("abcd","bbcd","cbcd").skip(1);
		onceModifiedStream.forEach(System.out::println);
		System.out.println("-----------------------------");
		
		Stream<String> stream = Stream.of("abcd","bcd2","xyz3");
		Stream<String> twiceModifiedStream = stream.skip(1).map(x->x.substring(0,3));
		twiceModifiedStream.forEach(System.out::println);
		System.out.println("-----------------------------");
		
		List<String> list = Arrays.asList("abcd","bcd2","xyz3");
		long count = list.stream().skip(1).map(x->x.substring(0,3)).sorted().count();
		System.out.println(count);
	}

}
