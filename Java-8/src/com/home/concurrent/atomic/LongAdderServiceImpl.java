package com.home.concurrent.atomic;

import java.util.concurrent.atomic.LongAdder;

public class LongAdderServiceImpl implements LongAdderService {

	private LongAdder longAdder=new LongAdder();

	@Override
	public long decrement() {
		longAdder.decrement();
		return getValue();
	}

	@Override
	public long getValue() {
		return longAdder.longValue();
	}

	@Override
	public long increment() {
		longAdder.increment();
		return getValue();
	}

}
