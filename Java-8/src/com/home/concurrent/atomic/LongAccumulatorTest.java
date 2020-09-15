package com.home.concurrent.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

public class LongAccumulatorTest{

	public static void main(String[] args) {
		
		LongBinaryOperator accumulatorFunction=(x,y)->x+y;
		LongAccumulator longAccumulator=new LongAccumulator(accumulatorFunction, 5l);
		
		LongAccumulatorService accumulatorService1=new LongAccumulatorServiceImpl(longAccumulator, 10L);
		LongAccumulatorService accumulatorService2=new LongAccumulatorServiceImpl(longAccumulator, 10L);
		
		List<Callable<Long>> tasks=new ArrayList<>();
		tasks.add(accumulatorService1);
		tasks.add(accumulatorService2);
		
		try {
			List<Future<Long>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);
			for (Future<Long> future : invokeAll) {
				future.get();
			}
			System.out.println(longAccumulator.get());
			
		} catch (InterruptedException | ExecutionException  e) {
			e.printStackTrace();
		}
	}
}
