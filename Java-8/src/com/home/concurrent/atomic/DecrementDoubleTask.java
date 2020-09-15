package com.home.concurrent.atomic;

import java.util.concurrent.Callable;

public class DecrementDoubleTask implements Callable<Double> {

	private DoubleAdderService doubleAdderService;
	private double noOfTimes;

	public DecrementDoubleTask(DoubleAdderService doubleAdderService, double noOfTimes) {
		super();
		this.doubleAdderService = doubleAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Double call() throws Exception {
		for (int i = 0; i <noOfTimes; i++) {
			doubleAdderService.decrement();
		}
		return doubleAdderService.getValue();
	}

}
