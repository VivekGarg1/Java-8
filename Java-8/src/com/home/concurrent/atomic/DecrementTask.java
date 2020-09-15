package com.home.concurrent.atomic;

import java.util.concurrent.Callable;

public class DecrementTask implements Callable<Long> {

	private LongAdderService longAdderService;
	private long noOfTimes;

	public DecrementTask(LongAdderService longAdderService, long noOfTimes) {
		super();
		this.longAdderService = longAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i <noOfTimes; i++) {
			longAdderService.decrement();
		}
		return longAdderService.getValue();
	}

}
