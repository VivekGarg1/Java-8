package com.home.advance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafeInCollectionTest {

	public static void main(String[] args) {
		 
		//Map<String,String> phoneMap=new HashMap<>();
		Map<String,String> phoneMap=new ConcurrentHashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC one");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			phoneMap.put("Redmi", "Note7Pro");//through exception using HashMap
			String phoneType = iterator.next();
			System.out.println("Key: "+phoneType+"\t"+"Value: "+phoneMap.get(phoneType));
		}
	}
}
