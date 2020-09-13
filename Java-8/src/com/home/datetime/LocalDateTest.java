package com.home.datetime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
	
 public static void main(String[] args) {
	LocalDate localDate = LocalDate.now();
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
	
	DayOfWeek dayOfWeek = LocalDate.parse("2017-03-05").getDayOfWeek();
	System.out.println(dayOfWeek);
	System.out.println("---------------");
	int dayOfMonth = LocalDate.parse("2017-03-05").getDayOfMonth();
	System.out.println(dayOfMonth);
	System.out.println("---------------");
	LocalDate thisYear =LocalDate.now();
	System.out.println(thisYear.isLeapYear());
	System.out.println("---------------");
	LocalDate previousYear =LocalDate.now().minusYears(1);
	System.out.println(previousYear.isLeapYear());
	System.out.println("---------------");
	boolean before = LocalDate.parse("2017-03-05").isBefore(LocalDate.parse("2017-02-28"));
	System.out.println(before);
	System.out.println("---------------");
	boolean after = LocalDate.parse("2017-03-05").isAfter(LocalDate.parse("2017-02-28"));
	System.out.println(after);
	System.out.println("---------------");
	LocalDateTime atStartOfDay = LocalDate.parse("2017-03-05").atStartOfDay();
	System.out.println(atStartOfDay);
	System.out.println("---------------");
	LocalDate with = LocalDate.parse("2017-03-05").with(TemporalAdjusters.firstDayOfMonth());
	System.out.println(with);
	System.out.println("---------------");
}
}
