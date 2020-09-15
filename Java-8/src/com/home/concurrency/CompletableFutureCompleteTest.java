package com.home.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureCompleteTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> caculateAsynch = caculateAsynch();
		String result = caculateAsynch.get();
		System.out.println(result);
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
				completableFuture.complete(joinStr);
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		});
		return completableFuture;
	}

}
