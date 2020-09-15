package com.home.concurrency;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachTest {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
		for (int i = 0; i < 101; i++) {
			concurrentHashMap.put(i, "person_" + i);
		}
		// Here only main thread run so output will be sequentiial
		concurrentHashMap.forEach((k, v) -> {
			System.out.println("Thread: " + Thread.currentThread().getName());
			System.out.println("Key: " + k + ",Value: " + v);
		});

		System.out.println("-----------------------------------------------");
		// Compute Parallaly output not come in sequential manner beacause 3 more thread
		// run alongwith main
		concurrentHashMap.forEach(3, (k, v) -> {
			System.out.println("Thread: " + Thread.currentThread().getName());
			System.out.println("Key: " + k + ",Value: " + v);
		});

		System.out.println("-----------------------------------------------");

		// forEachKey
		ConcurrentHashMap<String, UUID> concurrentHashMap1 = new ConcurrentHashMap<>();
		for (int i = 0; i < 51; i++) {
			concurrentHashMap1.put("Session_" + i, UUID.randomUUID());
		}
		concurrentHashMap1.forEachKey(3, System.out::println);

		System.out.println("-----------------------------------------------");

		// forEachValue
		concurrentHashMap1.forEachValue(3, System.out::println);
		
		System.out.println("-----------------------------------------------");

		// forEachEntry
		concurrentHashMap1.forEachEntry(3, System.out::println);
	}

}
