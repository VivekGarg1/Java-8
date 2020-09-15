package com.home.advance;

import java.util.Arrays;
import java.util.List;

public class StringClassEnhancementTest {

	public static void main(String[] args) {
		
		String join = String.join("-", "Hello","India",null);
		System.out.println(join);
		
		List<String> list=Arrays.asList("Vivek","Prabhat","Paras");
		String join2 = String.join(",",list);
		System.out.println(join2);
	}

}
