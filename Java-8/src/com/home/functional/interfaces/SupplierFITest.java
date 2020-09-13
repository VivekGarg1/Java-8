package com.home.functional.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFITest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier=SupplierFITest::getNum;
		for (int i = 0; i < 21; i++) {
			System.out.println(supplier.get());
		}
	}
	
	private static Integer getNum() {
		Random random=new Random();
		return random.nextInt(100);
	}
}
