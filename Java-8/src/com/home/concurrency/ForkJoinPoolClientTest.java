package com.home.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;

public class ForkJoinPoolClientTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		LongAdder longAdder=new LongAdder();
		MyTask myTask=new MyTask(longAdder, 10);
		List<Callable<Integer>> tasks=new ArrayList<>();
		tasks.add(myTask);
		
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		List<Future<Integer>> invokeAll = commonPool.invokeAll(tasks);
		for (Future<Integer> future : invokeAll) {
			future.get();
		}
		System.out.println(longAdder.intValue());
		int commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
		System.out.println(commonPoolParallelism);
	}

}
