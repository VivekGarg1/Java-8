package com.home.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureRunAndSupplyAsyncTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task1 is completed..");
		});
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task2 is completed..");
		},Executors.newFixedThreadPool(2));
		
		//supplyAsynch
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->"My task3 is completed..");
		String result = supplyAsync.get();
		System.out.println(result);
		
		CompletableFuture<String> supplyAsync1 =CompletableFuture.supplyAsync(()->{
			return "My task4 is completed..";
		},Executors.newFixedThreadPool(2));
		String result1 = supplyAsync1.get();
		System.out.println(result1);
	}
}
