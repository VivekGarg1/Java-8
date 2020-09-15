package com.home.defaultmethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterfaceTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Vivek");
		map.put(2, "Paras");
		map.put(3, "Prabhat");

		// getOrDefault
		String result = map.getOrDefault(2, "Shubham");
		System.out.println(result);
		String result1 = map.getOrDefault(4, "Shubham");
		System.out.println(result1);
		System.out.println("----------------------------");

		// forEach
		map.forEach((k, v) -> System.out.println("Key: " + k + "\t" + "Value: " + v));
		System.out.println("----------------------------");

		// replaceAll
		map.replaceAll((k, v) -> {
			return v + " with id " + k;
		});
		map.forEach((k, v) -> System.out.println("Key: " + k + "\t" + "Value: " + v));
		System.out.println("----------------------------");

		// putIfAbsent
		String putIfAbsent = map.putIfAbsent(4, "Hariom");
		System.out.println(putIfAbsent);
		System.out.println(map.get(4));
		String putIfAbsent1 = map.putIfAbsent(3, "Hariom");
		System.out.println(putIfAbsent1);
		System.out.println(map.get(3));
		System.out.println("----------------------------");

		// remove
		Map<Integer, String> mapData = new HashMap<>();
		mapData.put(1, "Vivek");
		mapData.put(2, "Paras");
		mapData.put(3, "Prabhat");
		boolean remove = mapData.remove(2, "Paras");
		System.out.println(remove);
		mapData.forEach((k, v) -> System.out.println("Key: " + k + "\t" + "Value: " + v));
		System.out.println("----------------------------");

		// replace
		boolean replace = mapData.replace(3, "Prabhat", "Shubham");
		System.out.println(replace);
		mapData.forEach((k, v) -> System.out.println("Key: " + k + "\t" + "Value: " + v));
		System.out.println("----------------------------");

		String replace2 = mapData.replace(3, "Prabhat");
		System.out.println(replace2);
		mapData.forEach((k, v) -> System.out.println("Key: " + k + "\t" + "Value: " + v));
		System.out.println("----------------------------");

		// compute
		Map<Integer, String> mapInfo = new LinkedHashMap<>();
		mapInfo.put(1, "Vivek");
		mapInfo.put(2, "Paras");
		mapInfo.put(3, "Prabhat");
		System.out.println("Original map: " + mapInfo);
		// replace the values
		mapInfo.compute(1, (key, oldValue) -> oldValue.concat(" Garg"));
		mapInfo.compute(2, (key, oldValue) -> oldValue.concat(" Gupta"));
		mapInfo.compute(3, (key, oldValue) -> oldValue.concat(" Singh"));
		System.out.println("Recomputed map: " + mapInfo);
		// return null to remove value
		String compute1 = mapInfo.compute(3, (key, oldValue) -> null);
		System.out.println(compute1);
		// null for does nothing
		String compute2 = mapInfo.compute(4, (key, oldValue) -> null);
		System.out.println(compute2);
		// Return value and add in map
		String compute3 = mapInfo.compute(4, (key, oldValue) -> "Shubham Sharma");
		System.out.println(compute3);
		System.out.println("After null:" + mapInfo);
		System.out.println("----------------------------");
		
		// computeIfPresent
		Map<Integer, String> mapInfo1 = new LinkedHashMap<>();
		mapInfo1.put(1, "Vivek");
		mapInfo1.put(2, "Paras");
		mapInfo1.put(3, "Prabhat");
		System.out.println("Original map: " + mapInfo1);
		// replace the values
		mapInfo1.computeIfPresent(1, (key, oldValue) -> oldValue.concat(" Garg"));
		mapInfo1.computeIfPresent(2, (key, oldValue) -> oldValue.concat(" Gupta"));
		mapInfo1.computeIfPresent(3, (key, oldValue) -> oldValue.concat(" Singh"));
		System.out.println("Recomputed map: " + mapInfo1);
		// return null to remove value
		String compute4 = mapInfo1.computeIfPresent(3, (key, oldValue) -> null);
		System.out.println(compute4);
		// null for does nothing
		String compute5 = mapInfo1.computeIfPresent(4, (key, oldValue) -> null);
		System.out.println(compute5);
		// Return value and add in map
		String compute6 = mapInfo1.computeIfPresent(4, (key, oldValue) -> "Shubham Sharma");
		System.out.println(compute6);
		System.out.println("After null:" + mapInfo1);
		System.out.println("----------------------------");
		
		// computeIfAbsent
		Map<Integer, String> mapInfo2 = new LinkedHashMap<>();
		mapInfo2.put(1, "Vivek");
		mapInfo2.put(2, "Paras");
		mapInfo2.put(3, null);
		System.out.println("Original map: " + mapInfo2);
		// replace the values
		mapInfo2.computeIfAbsent(1, key -> key+" Garg");
		System.out.println("No change: " + mapInfo2);
		mapInfo2.computeIfAbsent(3, key ->"Prabhat Singh");
		System.out.println("Updated null: " + mapInfo2);
		mapInfo2.computeIfAbsent(4, key -> "Shubham Sharma");
		System.out.println("Added new key: " + mapInfo2);
		
		Map<String ,Collection<String>> collectionMap=new HashMap<>();
		collectionMap.computeIfAbsent("names", key -> new ArrayList<>()).add("Vivek");
		System.out.println("collectionMap: "+collectionMap);
		collectionMap.computeIfAbsent("names", key -> new ArrayList<>()).add("Paras");
		collectionMap.computeIfAbsent("names", key -> new ArrayList<>()).add("Prabhat");
		
		collectionMap.computeIfAbsent("fruit", key -> new ArrayList<>()).add("apple");
		collectionMap.computeIfAbsent("fruit", key -> new ArrayList<>()).add("banana");
		System.out.println("collectionMap: "+collectionMap);
		System.out.println("----------------------------");
		
		//merge
		Map<String, Integer> priceMap = new LinkedHashMap<>();
		System.out.println("Price map: "+priceMap);
		priceMap.merge("fruits", 1,Integer::sum);
		priceMap.merge("fruits", 2,Integer::sum);
		priceMap.merge("fruits", 3,Integer::sum);
		System.out.println("Price map: "+priceMap);
		priceMap.merge("fruits", 4,(oldVal,newval)->{
			System.out.println("Old Value: "+oldVal+"\t"+"New value: "+newval);
			return null;
		});
		System.out.println("Price map: "+priceMap);
		priceMap.put("bread", null);
		System.out.println("Price map: "+priceMap);
		priceMap.merge("bread", 3,Integer::sum);
		priceMap.merge("bread", 4,Integer::sum);
		System.out.println("Price map: "+priceMap);
		System.out.println("----------------------------");
	}
}
