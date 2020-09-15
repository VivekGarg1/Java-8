package com.home.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureExceptionHandlingTest {

	public static void main(String[] args){
		String name=null;
		
		CompletableFuture<String> handle = CompletableFuture.supplyAsync(()->{
			if(name==null)
				throw new RuntimeException("Computation Error!!!");
			return "Hello "+name;
		}).handle((s,t)->s!=null?s:"Hello Stranger!!!");
		try {
			System.out.println(handle.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
		
		//normal case
		/*CompletableFuture<String> handle = CompletableFuture.supplyAsync(()->{
			if(name==null)
				throw new RuntimeException("Computation Error!!!");
			return "Hello "+name;
		});
		try {
			System.out.println(handle.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}*/
		}
}
