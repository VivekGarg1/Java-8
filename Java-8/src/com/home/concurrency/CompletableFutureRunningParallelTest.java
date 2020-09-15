package com.home.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureRunningParallelTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completedFuture1 = CompletableFuture.supplyAsync(()->"India");
		CompletableFuture<String> completedFuture2 = CompletableFuture.supplyAsync(()->"is very");
		CompletableFuture<String> completedFuture3 = CompletableFuture.supplyAsync(()->"beautiful country!!!");	
		//allOf method has a limitation it does not return combine result its return type is void
		CompletableFuture<Void> allOf = CompletableFuture.allOf(completedFuture1,completedFuture2,completedFuture3);
		System.out.println(completedFuture1.isDone());
		System.out.println(completedFuture2.isDone());
		System.out.println(completedFuture3.isDone());
		
		//Overcome above problem use stream
		String collect = Stream.of(completedFuture1,completedFuture2,completedFuture3)
		.map(CompletableFuture::join).collect(Collectors.joining(" "));
		System.out.println(collect);
		
	}
}
