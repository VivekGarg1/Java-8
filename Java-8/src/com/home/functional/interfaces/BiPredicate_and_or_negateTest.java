package com.home.functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicate_and_or_negateTest {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x > y;
		BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x - 2 > y;
		// and operator
		System.out.println(biPredicate1.and(biPredicate2).test(10, 7));
		System.out.println(biPredicate1.and(biPredicate2).test(10, 9));

		System.out.println("-------------------------------------------");

		// or opearator
		System.out.println(biPredicate1.or(biPredicate2).test(10, 7));
		System.out.println(biPredicate1.or(biPredicate2).test(10, 11));

		System.out.println("-------------------------------------------");

		// negate opearator
		System.out.println(biPredicate1.negate().test(10, 7));
	}

}
