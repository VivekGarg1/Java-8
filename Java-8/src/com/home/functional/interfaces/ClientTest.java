package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {
		//createThreadUsingAnonymousClass();
		//createThreadUsingLambdaExpression();
		//displayNameList();
		displayNameListUsingLambdaExpresion();
	}

	private static void displayNameListUsingLambdaExpresion() {
		List<String> nameList=new ArrayList<>();
		nameList.add("Vivek");
		nameList.add("Vasu");
		nameList.add("Shubham");
		//nameList.forEach( (name) ->System.out.println(name));
		nameList.forEach(System.out::println);
	}

	private static void displayNameList() {
		List<String> nameList=new ArrayList<>();
		nameList.add("Vivek");
		nameList.add("Vasu");
		nameList.add("Shubham");
		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
	}

	private static void createThreadUsingLambdaExpression() {
		Runnable r = () -> {
				System.out.println("Task is executing");
			};
		Thread t = new Thread(r);
		t.start();
}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Task is executing");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
