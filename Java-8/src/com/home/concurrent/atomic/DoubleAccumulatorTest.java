package com.home.concurrent.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulatorTest{

	public static void main(String[] args) {
		
		DoubleBinaryOperator accumulatorFunction=(x,y)->x+y;
		DoubleAccumulator doubleAccumulator=new DoubleAccumulator(accumulatorFunction, 5.0);
		
		DoubleAccumulatorService accumulatorService1=new DoubleAccumulatorService(doubleAccumulator, 10L);
		DoubleAccumulatorService accumulatorService2=new DoubleAccumulatorService(doubleAccumulator, 10L);
		
		List<Callable<Double>> tasks=new ArrayList<>();
		tasks.add(accumulatorService1);
		tasks.add(accumulatorService2);
		
		try {
			List<Future<Double>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);
			for (Future<Double> future : invokeAll) {
				future.get();
			}
			double finalresultInDouble = doubleAccumulator.get();
			System.out.println(finalresultInDouble);
			
			//result in float
			Float finalresultInFloat = doubleAccumulator.floatValue();
			System.out.println(finalresultInFloat);
			
			/*doubleAccumulator.reset();
			System.out.println(doubleAccumulator.get());*/
			
			System.out.println(doubleAccumulator.getThenReset());
			System.out.println(doubleAccumulator.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
