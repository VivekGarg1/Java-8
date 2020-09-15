package com.home.concurrent.atomic;

import java.util.concurrent.Callable;

public interface LongAccumulatorService extends Callable<Long>{

	long increment();
	long finalValue();
}
