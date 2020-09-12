package com.home.lambda.expresson;

public class LabdaWithInterfaceClient {

	public static void main(String[] args) {
		// createThreadWithoutLambda();
		// createThreadUsingAnnonymousClass();
		// createThreadUsingLambdaExp();
		// functionalInterfaceMethodCall();
		functionalInterfaceLambdaMethodCall();
	}

	private static void functionalInterfaceLambdaMethodCall() {
		MyFunctionalInterface functionalInterface =() -> System.out.println("Method1 execute!!!");
		functionalInterface.method1();
		
		System.out.println("---------------------------------------");
		MyFunctionalInterface2 functionalInterface2 =name -> System.out.println("Hello "+name);
		functionalInterface2.method2("Vivek Garg");
		
		System.out.println("---------------------------------------");
		MyFunctionalInterface3 functionalInterface3 =(name,age) -> System.out.println("Hello "+name+" you are "+age+" years old!!!");
		functionalInterface3.method3("Vivek Garg", 23);
		
	}

	private static void functionalInterfaceMethodCall() {
		MyFunctionalInterface functionalInterface = new MyFunctionalInterface() {

			@Override
			public void method1() {
				System.out.println("Method1 execute!!!");
			}
		};
		functionalInterface.method1();
	}

	private static void createThreadUsingLambdaExp() {
		Runnable r = () -> System.out.println("Task is executed!!!");
		Thread t = new Thread(r);
		t.start();
	}

	private static void createThreadUsingAnnonymousClass() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Task is executed!!!");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

	private static void createThreadWithoutLambda() {
		MyThread r = new MyThread();
		Thread t = new Thread(r);
		t.start();
	}
}
