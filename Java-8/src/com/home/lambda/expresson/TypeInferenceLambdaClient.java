package com.home.lambda.expresson;

public class TypeInferenceLambdaClient {

	public static void main(String[] args) {
		TypeInferenceComparator comparator=(n1,n2)->n1>n2;
		System.out.println(comparator.compare(40, 30));
	}

}
