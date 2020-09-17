package com.home.wrapper;

import java.util.Scanner;

public class BooleanClientTest {

	public static void main(String[] args) {
		int hashCodeTrue = Boolean.hashCode(true);
		int hashCodeFale = Boolean.hashCode(true);
		System.out.println(hashCodeTrue);
		System.out.println(hashCodeFale);
		boolean logicalOr = Boolean.logicalOr(10 > 20, 20 > 10);
		System.out.println(logicalOr);
		boolean logicalAnd = Boolean.logicalAnd(10 > 20, 20 > 10);
		System.out.println(logicalAnd);
		Boolean.logicalXor(10 > 20, 20 > 10);
		System.out.println(logicalAnd);
		
	}

}
