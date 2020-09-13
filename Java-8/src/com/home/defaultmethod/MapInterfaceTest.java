package com.home.defaultmethod;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Vivek");
		map.put(2, "Paras");
		map.put(3, "Prabhat");
		
		//getOrDefault
		String result = map.getOrDefault(2, "Shubham");
		System.out.println(result);
		String result1= map.getOrDefault(4, "Shubham");
		System.out.println(result1);
		System.out.println("----------------------------");
		
		//forEach
		map.forEach((k,v)-> System.out.println("Key: "+k+"\t"+"Value: "+v));
		System.out.println("----------------------------");
		
		//replaceAll
		map.replaceAll((k,v)->{
			return v+" with id "+k;
		});
		map.forEach((k,v)-> System.out.println("Key: "+k+"\t"+"Value: "+v));
		System.out.println("----------------------------");
		
		//putIfAbsent
		String putIfAbsent = map.putIfAbsent(4, "Hariom");
		System.out.println(putIfAbsent);
		System.out.println(map.get(4));
		String putIfAbsent1 = map.putIfAbsent(3, "Hariom");
		System.out.println(putIfAbsent1);
		System.out.println(map.get(3));
		System.out.println("----------------------------");
		
		//remove
		Map<Integer,String> mapData=new HashMap<>();
		mapData.put(1, "Vivek");
		mapData.put(2, "Paras");
		mapData.put(3, "Prabhat");
		boolean remove = mapData.remove(2, "Paras");
		System.out.println(remove);
		mapData.forEach((k,v)-> System.out.println("Key: "+k+"\t"+"Value: "+v));
		System.out.println("----------------------------");
		
		//replace
		boolean replace = mapData.replace(3,"Prabhat", "Shubham");
		System.out.println(replace);
		mapData.forEach((k,v)-> System.out.println("Key: "+k+"\t"+"Value: "+v));
		System.out.println("----------------------------");
		
		
		String replace2 = mapData.replace(3,"Prabhat");
		System.out.println(replace2);
		mapData.forEach((k,v)-> System.out.println("Key: "+k+"\t"+"Value: "+v));
		System.out.println("----------------------------");
	}
}
