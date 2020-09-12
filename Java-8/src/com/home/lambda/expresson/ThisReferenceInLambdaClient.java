package com.home.lambda.expresson;

public class ThisReferenceInLambdaClient {

	public static void main(String[] args) {
		int b=40;
		ThisReferenceInLambdaClient.doOperate(b, new Operation() {
			
			@Override
			public void operate(int n) {
				System.out.println(b+n);
				System.out.println(this);
			}
		});
		
		ThisReferenceInLambdaClient.doOperate(b, n->{
			System.out.println(n+b);
			//This can not be instantiate here cause of static area
			//System.out.println(this);
		});
		
		new ThisReferenceInLambdaClient().process();
	}
	
	public void process() {
		doOperate(30, n->{
			System.out.println(n+30);
			System.out.println(this);
		});
	}
	
	public static void doOperate(int i,Operation o) {
		o.operate(i);
	}
}
