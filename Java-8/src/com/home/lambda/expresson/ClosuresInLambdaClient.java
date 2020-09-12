package com.home.lambda.expresson;

public class ClosuresInLambdaClient {

	public static void main(String[] args) {
		
		int x=30;
		int y=40;
		
		doOperate(x, new Operation() {
			
			@Override
			public void operate(int n) {
				//we can not override y value here because y value is final in 1.7 version we need to declare y value explicitly it final
				System.out.println(n+y);
			}
		});
		
		//or closure in lambda
		doOperate(x,n->System.out.println(y+n));
		
	}
	
	public static void doOperate(int i,Operation o) {
		o.operate(i);
	}
}
