package com.home.concurrent.atomic;

public interface LongAdderService {

	long increment();
	long decrement();
	long getValue();
}
