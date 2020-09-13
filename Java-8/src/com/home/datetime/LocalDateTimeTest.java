package com.home.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		System.out.println("----------------------------------");
		LocalDateTime of = LocalDateTime.of(2020,Month.APRIL, 25, 17, 15, 40);
		System.out.println(of);
		System.out.println("----------------------------------");
		LocalDateTime parse = LocalDateTime.parse("2020-07-21T17:15:12");
		System.out.println(parse);
		System.out.println("----------------------------------");
		LocalDate localDate = parse.toLocalDate();
		System.out.println(localDate);
		System.out.println("----------------------------------");
		LocalTime localTime = parse.toLocalTime();
		System.out.println(localTime);
		System.out.println("----------------------------------");
		System.out.println(LocalDateTime.MAX);
		System.out.println("----------------------------------");
		System.out.println(LocalDateTime.MIN);
		System.out.println("----------------------------------");
	}
}
