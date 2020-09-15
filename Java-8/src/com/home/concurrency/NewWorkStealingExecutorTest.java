package com.home.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWorkStealingExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newWorkStealingPool();
		List<Callable<String>> tasks=Arrays.asList(()->"My task1",()->"My task2",()->"My task3",()->"My task4");
		
		executorService.invokeAll(tasks).stream().map(future->{
			try {
				return future.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}

}
