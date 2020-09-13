package com.home.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDateTimeTest {

	public static void main(String[] args) {
		
		LocalDate initialDate = LocalDate.parse("2017-05-13");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		Period between = Period.between(initialDate, finalDate);
		System.out.println(between);
		System.out.println("----------------------------------");
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days);
		System.out.println("----------------------------------");
		long between2 = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between2);
		System.out.println("----------------------------------");
	}
}
