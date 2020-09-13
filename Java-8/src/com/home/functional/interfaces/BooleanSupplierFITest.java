package com.home.functional.interfaces;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFITest {

	public static void main(String[] args) {
		
		BooleanSupplier booleanSupplier=BooleanSupplierFITest::getNum;
		System.out.println(booleanSupplier.getAsBoolean());
		
		BooleanSupplier booleanSupplier1=()->true;
		System.out.println(booleanSupplier1.getAsBoolean());
	}
	
	private static boolean getNum() {
		int x=10;
		int y=20;
		if(x<y)
			return true;
		else
			return false;
		
	}
}
