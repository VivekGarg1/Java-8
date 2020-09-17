package com.home.advance;

import static java.lang.Math.*;

public class MathClientTest {

	public static void main(String[] args) {
		
		int addExact = addExact(Integer.MIN_VALUE, 1);
		System.out.println(addExact);
		
		try {
			int addExact1 = addExact(Integer.MAX_VALUE, 1);
			System.out.println(addExact1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int subtractExact = subtractExact(20, 10);
		System.out.println(subtractExact);
		long incrementExact = incrementExact(10000l);
		System.out.println(incrementExact);
		
		int floorDiv = floorDiv(45, 4);
		System.out.println(floorDiv);
		
		int floorDiv1 = floorDiv(-45, 4);
		System.out.println(floorDiv1);
		
		double nextDown = nextDown(Double.NaN);
		System.out.println(nextDown);
		double nextDown1 = nextDown(Double.NEGATIVE_INFINITY);
		System.out.println(nextDown1);
		double nextDown2 = nextDown(0);
		System.out.println(nextDown2);
		double nextDown3 = nextDown(2);
		System.out.println(nextDown3);
		
	}
}
