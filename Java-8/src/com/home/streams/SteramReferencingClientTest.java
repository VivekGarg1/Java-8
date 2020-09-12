package com.home.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramReferencingClientTest {

	public static void main(String[] args) {
		
		List<String> collect = Stream.of("a","b","c").filter(x->x.contains("b")).collect(Collectors.toList());
		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());
		
		System.out.println("---------------------------------");
		
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
