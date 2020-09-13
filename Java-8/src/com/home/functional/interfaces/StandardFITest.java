package com.home.functional.interfaces;

import java.util.function.Function;

public class StandardFITest {

	public static void main(String[] args) {
		
		//Traditional approach
		/*Foo foo=s->s+" from Lambda";
		UseFoo useFoo=new UseFoo();
		String result = useFoo.add("Vivek", foo);
		System.out.println(result);*/
		
		//Use functional interface to reduce Foo interface cost
		Function<String, String> function=s->s+" from Lambda";
		UseFoo useFoo=new UseFoo();
		String result = useFoo.add("Vivek", function);
		System.out.println(result);
	}
}
