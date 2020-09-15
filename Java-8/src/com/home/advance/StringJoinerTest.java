package com.home.advance;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		
		StringJoiner joiner=new StringJoiner(",");
		joiner.add("How").add("are").add("you?");
		System.out.println(joiner);
		
		StringJoiner joiner1=new StringJoiner(" ", "[", "]");
		joiner1.add("India").add("is").add("beautiful").add("country");
		System.out.println(joiner1);
		
		StringJoiner merge = joiner1.merge(joiner);
		System.out.println(merge);
	}

}
