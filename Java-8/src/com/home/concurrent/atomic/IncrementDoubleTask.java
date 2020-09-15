package com.home.concurrent.atomic;

import java.util.concurrent.Callable;

public class IncrementDoubleTask implements Callable<Double> {

	private DoubleAdderService doubleAdderService;
	private double noOfTimes;

	public IncrementDoubleTask(DoubleAdderService doubleAdderService, double noOfTimes) {
		super();
		this.doubleAdderService = doubleAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Double call() throws Exception {
		for (int i = 0; i <noOfTimes; i++) {
			doubleAdderService.increment();
		}
		return doubleAdderService.getValue();
	}

}
