package com.home.concurrent.atomic;

import java.util.concurrent.Callable;

public class IncrementTask implements Callable<Long> {

	private LongAdderService longAdderService;
	private long noOfTimes;

	public IncrementTask(LongAdderService longAdderService, long noOfTimes) {
		super();
		this.longAdderService = longAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i <noOfTimes; i++) {
			longAdderService.increment();
		}
		return longAdderService.getValue();
	}

}
