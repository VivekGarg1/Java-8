package com.home.concurrent.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DoubleAdderTest{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		DoubleAdderService doubleAdderService=new DoubleAdderServiceImpl();
		IncrementDoubleTask task1=new IncrementDoubleTask(doubleAdderService, 100.0);
		DecrementDoubleTask task2=new DecrementDoubleTask(doubleAdderService, 50.0);
		
		List<Callable<Double>> tasks=new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<Double>> invokeAll = executorService.invokeAll(tasks);
		for (Future<Double> future : invokeAll) {
			future.get();
		}
		System.out.println(doubleAdderService.getValue());
	}
}
