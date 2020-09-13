package com.home.functional.interfaces;

import java.util.function.BiFunction;

public class BiFunctionFITest {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,String> biFunction=(num1,num2)->"result is: "+(num1+num2);
		System.out.println(biFunction.apply(100, 200));
	}
}
