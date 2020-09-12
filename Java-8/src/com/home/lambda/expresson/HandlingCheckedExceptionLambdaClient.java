package com.home.lambda.expresson;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.List;;

public class HandlingCheckedExceptionLambdaClient {

	public static void main(String[] args) {
		List<Integer> numbers = asList(3, 9, 7, 0, 6, 10, 20);
		numbers.forEach(i ->{try {
			System.out.println(writeToFile(i));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}});
	}

	private static Object writeToFile(Integer i) throws IOException{
		return i*2;
	}
}
