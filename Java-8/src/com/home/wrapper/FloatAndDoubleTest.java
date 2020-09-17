package com.home.wrapper;

public class FloatAndDoubleTest {

	public static void main(String[] args) {
		float sum = Float.sum(10.0f, 20.0f);
		System.out.println(sum);
		float max = Float.max(10.0f, 20.0f);
		System.out.println(max);
		float min = Float.min(10.0f, 20.0f);
		System.out.println(min);
		//boolean finite = Float.isFinite(10);
		boolean finite = Float.isFinite(10.0f/0);
		System.out.println(finite);
		int hashCode = Float.hashCode(10.0f);
		System.out.println(hashCode);
		
		//Same for Double
	}

}
