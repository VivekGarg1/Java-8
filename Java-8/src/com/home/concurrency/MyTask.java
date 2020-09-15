package com.home.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class MyTask implements Callable<Integer> {

	private LongAdder longAdder;
	private int noOfTimes;
	
	public MyTask(LongAdder longAdder, int noOfTimes) {
		super();
		this.longAdder = longAdder;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Integer call() throws Exception {
		for (int i = 1; i <=noOfTimes; i++) {
			System.out.println(Thread.currentThread().getName());
			longAdder.add(i);
		}
		return longAdder.intValue();
	}

}
