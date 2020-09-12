package com.home.lambda.expresson;

public class LabdaReturnValueClient {

	public static void main(String[] args) {

		MyInterfaceForReturnValue forReturnValue=(a1,a2)->a1>a2;
		System.out.println(forReturnValue.test(35, 40));
		System.out.println(forReturnValue.test(40, 35));
	}

}
