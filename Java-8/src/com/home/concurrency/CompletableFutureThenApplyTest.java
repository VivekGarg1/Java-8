package com.home.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureThenApplyTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completedFuture = CompletableFuture.supplyAsync(()->"Hello ");
		completedFuture=completedFuture.thenApply(s->s+"World!!!");
		String result = completedFuture.get();
		System.out.println(result);
		
		CompletableFuture<String> completedFuture1 = CompletableFuture.supplyAsync(()->"Hello ");
		completedFuture1.thenAccept(s->System.out.println(s+"World!!!"));
		completedFuture1.get();	
		
		CompletableFuture<String> completedFuture2 = CompletableFuture.supplyAsync(()->"Hello ");
		completedFuture2.thenRun(()->System.out.println("World!!!"));
		completedFuture2.get();	
		
	}
}
