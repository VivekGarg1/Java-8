package com.home.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		System.out.println(zoneId);
		System.out.println("-----------------------------------------------");
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.forEach(System.out::println);
		System.out.println("------------------");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime);
		System.out.println("------------------");
		LocalDateTime localDateTime = LocalDateTime.of(2020,Month.APRIL, 25, 17, 15, 40);
		ZoneOffset zoneOffset = ZoneOffset.of("+02:30");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println(offsetDateTime);
		System.out.println("------------------");
	}

}
