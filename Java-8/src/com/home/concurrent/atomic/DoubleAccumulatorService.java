package com.home.concurrent.atomic;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorService implements Callable<Double>{

	private DoubleAccumulator doubleAccumulator;
	private long noOftimes;

	public DoubleAccumulatorService(DoubleAccumulator doubleAccumulator, long noOftimes) {
		super();
		this.doubleAccumulator = doubleAccumulator;
		this.noOftimes = noOftimes;
	}

	@Override
	public Double call() throws Exception {
		for (int i = 1; i <= noOftimes; i++) {
			doubleAccumulator.accumulate(10.0);
		}
		return doubleAccumulator.get();
	}

}
