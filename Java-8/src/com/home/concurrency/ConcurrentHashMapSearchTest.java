package com.home.concurrency;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapSearchTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, UUID> concurrentHashMap = new ConcurrentHashMap<>();
		for (int i = 0; i < 51; i++) {
			concurrentHashMap.put(i, UUID.randomUUID());
		}
		Integer sessionId=20;
		String searchResult=concurrentHashMap.search(3, (k,v)->{
			if(k== sessionId) {
				return new String(k+":"+v);
			}
			return null;
		});
		System.out.println(searchResult);
		
		System.out.println("-----------------------------------------");
		
		Integer searchKeys = concurrentHashMap.searchKeys(3, k->{
			if(k==sessionId) {
				return k;
			}
			return null;
		});
		System.out.println(searchKeys);
		
		System.out.println("-----------------------------------------");
		
		String searchEntries = concurrentHashMap.searchEntries(3, k->{
			if(k.getValue().toString().contains("ab")) {
				return new String(k.getKey()+":"+k.getValue());
			}
			return null;
		});
		System.out.println(searchEntries);
		
		System.out.println("-----------------------------------------");
		
		UUID searchValues = concurrentHashMap.searchValues(3, v->{
			if(v.toString().contains("ab")) {
				return v;
			}
			return null;
		});
		System.out.println(searchValues);
	}

}
