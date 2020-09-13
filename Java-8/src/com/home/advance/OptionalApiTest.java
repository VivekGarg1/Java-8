package com.home.advance;

import java.util.Optional;

public class OptionalApiTest {

	public static void main(String[] args) {
		
		Integer value1=null;
		Integer value2=new Integer(10);
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		System.out.println(sum(a,b));
	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First parameter is present: "+a.isPresent());
		System.out.println("Second parameter is present: "+b.isPresent());
		Integer value1 = a.orElse(new Integer(5));
		Integer value2 = b.get();
		return value1+value2;
	}
}
