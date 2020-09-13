package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorFITest {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		
		BinaryOperator<String> binaryOperator=(k,v)->k+"-"+v;
		binaryOperatorFunction(binaryOperator,map).forEach(System.out::println);
	}

	private static List<String> binaryOperatorFunction(BinaryOperator<String> binaryOperator, Map<String, String> map) {
		List<String> biList=new ArrayList<>();
		map.forEach((k,v)->biList.add(binaryOperator.apply(k, v)));
		return biList;
	}
}
