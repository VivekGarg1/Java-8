package com.home.concurrent.atomic;

import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

public class DoubleAdderServiceImpl implements DoubleAdderService {

	private DoubleAdder doubleAdder=new DoubleAdder();

	@Override
	public double decrement() {
		doubleAdder.add(-1.0);
		return getValue();
	}

	@Override
	public double getValue() {
		return doubleAdder.doubleValue();
	}

	@Override
	public double increment() {
		doubleAdder.add(1.0);
		return getValue();
	}

}
