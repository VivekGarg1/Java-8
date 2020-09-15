package com.home.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapReduceTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("Vivek","India");
		concurrentHashMap.put("Dom","UK");
		concurrentHashMap.put("Rob","AU");
		concurrentHashMap.put("Martin","NZ");
		
		String reduce = concurrentHashMap.reduce(2, (k,v)->k+"-"+v, (r1,r2)->r1+","+r2);
		System.out.println(reduce);
		System.out.println("-----------------------");
		String reduceKeys = concurrentHashMap.reduceKeys(2, (k1,k2)->k1+","+k2);
		System.out.println(reduceKeys);
		System.out.println("-----------------------");
		String reduceValues = concurrentHashMap.reduceValues(2, (v1,v2)->v1+","+v2);
		System.out.println(reduceValues);
		System.out.println("-----------------------");
	}

}
