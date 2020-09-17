package com.home.advance;

public class ThreadLocalClientTest {

	public static void main(String[] args) {
		ThreadLocal<String> threadLocal=new ThreadLocal<>();
		threadLocal.set("This is local thread value");
		String result = threadLocal.get();
		System.out.println(result);
		
		ThreadLocalDemo r=new ThreadLocalDemo();
		Thread t1=new Thread(r, "Thread1");
		Thread t2=new Thread(r, "Thread2");
		Thread t3=new Thread(r, "Thread3");
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("---------------------------");
		
		ThreadLocalDemo1 r1=new ThreadLocalDemo1();
		Thread t4=new Thread(r1, "Thread1");
		Thread t5=new Thread(r1, "Thread2");
		t4.start();
		t5.start();
	}

}
