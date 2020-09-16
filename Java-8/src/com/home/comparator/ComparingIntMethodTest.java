package com.home.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntMethodTest {

	public static void main(String[] args) {
		List<String> empList=Arrays.asList("Vivek Garg","Paras","Prabhat","Shubham","Harish");
		Comparator<String> comparator = Comparator.comparingInt(String::length);
		Collections.sort(empList, comparator);
		empList.forEach(System.out::println);
	}

}
