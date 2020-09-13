package com.home.datetime;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		System.out.println("--------------");
		LocalTime parse = LocalTime.parse("09:30");
		System.out.println(parse);
		System.out.println("--------------");
		LocalTime of = LocalTime.of(9, 45);
		System.out.println(of);
		System.out.println("--------------");
		LocalTime plusHours = of.plusHours(1);
		System.out.println(plusHours);
		System.out.println("--------------");
		boolean before = LocalTime.parse("09:30").isBefore(LocalTime.parse("08:30"));
		System.out.println(before);
		System.out.println("--------------");
		System.out.println(LocalTime.MAX);
		System.out.println("--------------");
		System.out.println(LocalTime.MIN);
		System.out.println("--------------");
	}

}
