package com.home.lambda.expresson;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.function.Consumer;;

public class HandlingUncheckedExceptionLambdaClient {

	public static void main(String[] args) {
		List<Integer> numbers = asList(3, 9, 7, 0, 6, 10, 20);
		numbers.forEach(i -> {
			try {
				System.out.println(50 / i);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception occured: " + e.getMessage());
			}
		});
		System.out.println("--------------------------------------------------------");

		// Exception handling using lambda expression
		numbers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

		System.out.println("--------------------------------------------------------");

		// Generic Exception handling using lambda expression 
		numbers.forEach(genericWrapper(i -> System.out.println(50 / i), Exception.class));
	}

	public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception occured: " + e.getMessage());
			}
		};
	}

	// make it generic
	public static <T, E extends Exception> Consumer<T> genericWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Exception occured: " + e.getMessage());
			}
		};
	}
}
