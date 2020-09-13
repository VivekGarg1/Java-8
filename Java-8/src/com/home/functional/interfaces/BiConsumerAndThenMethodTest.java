package com.home.functional.interfaces;

import java.util.function.BiConsumer;

public class BiConsumerAndThenMethodTest {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> adder=(I1,I2)->System.out.println("Adder: "+(I1+I2));
		BiConsumer<Integer,Integer> multipler=(I1,I2)->System.out.println("Multiplier: "+(I1*I2));
		adder.andThen(multipler).accept(10, 20);
		System.out.println("--------------");
		multipler.andThen(adder).accept(15, 30);
	}
}
