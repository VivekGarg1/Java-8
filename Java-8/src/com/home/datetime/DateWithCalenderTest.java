package com.home.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateWithCalenderTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		LocalDateTime  localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime);
		System.out.println("-----------------------------");
		
		Calendar calendar=Calendar.getInstance();
		LocalDateTime  localDateTime2 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime2);
		System.out.println("-----------------------------");
	}
}
