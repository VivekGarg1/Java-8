package com.home.datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
	
 public static void main(String[] args) {
	LocalDate localDate=LocalDate.now();
	System.out.println(localDate);
	System.out.println("---------------");
	Clock clock=Clock.systemDefaultZone();
	localDate=LocalDate.now(clock);
	System.out.println(localDate);
	System.out.println("---------------");
	ZoneId zoneId=ZoneId.of("Europe/Paris");
	localDate=LocalDate.now(zoneId);
	System.out.println(localDate);
	System.out.println("---------------");
	localDate=LocalDate.of(2017,03,02);
	System.out.println(localDate);
	System.out.println("---------------");
	localDate=LocalDate.parse("2017-03-05");
	System.out.println(localDate);
	System.out.println("---------------");
	localDate=localDate.plusDays(2);
	System.out.println(localDate);
	System.out.println("---------------");
	localDate=localDate.minus(2,ChronoUnit.DAYS);
	System.out.println(localDate);
	System.out.println("---------------");
	
}
}
