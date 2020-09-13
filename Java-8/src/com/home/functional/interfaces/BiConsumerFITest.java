package com.home.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFITest {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		BiConsumer<Integer,String> biConsumer=(k,v)->System.out.println("Key:"+k+"\t"+"value:"+v);
		map.forEach(biConsumer);
		System.out.println("------------------------------------------------");
		//or
		map.forEach((k,v)->System.out.println("Key "+k+"\t"+"value "+v));
		
		System.out.println("------------------------------------------------");
		
		Map<Integer,Student> stuMap=new HashMap<>();
		stuMap.put(1, new Student("Vivek garg", 23));
		stuMap.put(2, new Student("Paras", 24));
		stuMap.put(3, new Student("Prabhat", 25));
		stuMap.forEach((k,v)->System.out.println("Key:"+k+"\t"+"value:"+v));
	}
}
