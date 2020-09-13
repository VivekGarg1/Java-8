package com.home.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationDateTimeTest {

	public static void main(String[] args) {
		
		LocalTime initialTime = LocalTime.of(6,30,0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(seconds);
		System.out.println("-------");
		long between = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(between);
	}
}
