package com.home.functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateFITest {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate=(num1,num2)->num1<num2;
		System.out.println(biPredicate.test(100, 200));
	}
}
