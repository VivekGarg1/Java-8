package com.home.concurrent.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LongAdderTest{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		LongAdderService longAdderService=new LongAdderServiceImpl();
		IncrementTask task1=new IncrementTask(longAdderService, 100l);
		DecrementTask task2=new DecrementTask(longAdderService, 50l);
		
		List<Callable<Long>> tasks=new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<Long>> invokeAll = executorService.invokeAll(tasks);
		for (Future<Long> future : invokeAll) {
			future.get();
		}
		System.out.println(longAdderService.getValue());
	}
}
