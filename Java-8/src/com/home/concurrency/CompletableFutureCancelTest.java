package com.home.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureCancelTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World!!!");
		String result = completedFuture.get();
		System.out.println(result);
		
		CompletableFuture<String> caculateAsynch = caculateAsynch();
		String result1 = caculateAsynch.get();
		System.out.println(result1);
		System.out.println(Thread.currentThread().getName());
	}
	
	private static CompletableFuture<String> caculateAsynch() {
		CompletableFuture<String> completableFuture=new CompletableFuture<>();
		List<String> list=new ArrayList<>();
		list.add("Vivek");
		list.add("Paras");
		list.add("Prabhat");
		Executors.newCachedThreadPool().submit(()->{
			try {
				Thread.sleep(20);
				String joinStr = String.join(",", list);
				System.out.println(Thread.currentThread().getName());
				completableFuture.complete(joinStr);
				//It depends on complete method return value if complete disable return exception
				completableFuture.cancel(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		});
		return completableFuture;
	}
}
