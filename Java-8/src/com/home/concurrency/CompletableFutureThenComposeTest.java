package com.home.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureThenComposeTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> completedFuture = CompletableFuture.supplyAsync(() -> "Hello ");
		completedFuture = completedFuture.thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "World!!!"));
		String result = completedFuture.get();
		System.out.println(result);

		CompletableFuture<String> completedFuture1 = CompletableFuture.supplyAsync(() -> "Hello ")
				.thenCombine(CompletableFuture.supplyAsync(() -> "World!!!"), (s1, s2) -> s1 + s2);
		System.out.println(completedFuture1.get());

		CompletableFuture.supplyAsync(() -> "Hello ").thenAcceptBoth(CompletableFuture.supplyAsync(() -> "World!!!"),
				(s1, s2) -> System.out.println(s1 + s2));
	}
}
