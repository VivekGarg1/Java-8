package com.home.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormattingDateTimeTest {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.of(2020,Month.APRIL, 25, 17, 15, 40);
		String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);
		System.out.println("-------------");
		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format2);
		System.out.println("-------------");
		String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
		System.out.println(format3);
		System.out.println("-------------");
	}
}
