package com.home.lambda.expresson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticMethodLambdaReferenceClient {
 
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		//Runnable command=()->System.out.println("My task is executed");
		//Reference to static method
		Runnable command=StaticMethodLambdaReferenceClient::myRun;
		executorService.execute(command);
	}
	
	private static void  myRun() {
		System.out.println("My task is executed");
	}
}
