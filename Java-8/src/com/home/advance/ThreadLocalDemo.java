package com.home.advance;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo implements Runnable {
	
	private static final AtomicInteger nextId=new AtomicInteger(0);
	private static final ThreadLocal<Integer> threadLocal=ThreadLocal.withInitial(()->nextId.getAndIncrement());

	@Override
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName()+" value: "+threadLocal.get());
	}

}
