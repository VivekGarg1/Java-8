package com.home.concurrent.atomic;

import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorServiceImpl implements LongAccumulatorService {

	private LongAccumulator longAccumulator;
	private long noOfTimes;

	public LongAccumulatorServiceImpl(LongAccumulator longAccumulator, long noOfTimes) {
		super();
		this.longAccumulator = longAccumulator;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public long increment() {
		longAccumulator.accumulate(10l);
		return finalValue();
	}

	@Override
	public long finalValue() {
		return longAccumulator.get();
	}

	@Override
	public Long call() throws Exception {
		for (int i = 1; i <= noOfTimes; i++) {
			increment();
		}
		return longAccumulator.get();
	}

}
