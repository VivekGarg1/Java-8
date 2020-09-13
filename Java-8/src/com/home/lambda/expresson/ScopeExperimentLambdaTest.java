package com.home.lambda.expresson;

public class ScopeExperimentLambdaTest {

	private String value="Enclosing scope value";
	
	public static void main(String[] args) {
		new ScopeExperimentLambdaTest().scopeExperiment();
	}

	private void scopeExperiment() {
		Foo foo1=new Foo() {
			String value="Annonymous Inner class scope value";
			@Override
			public String method() {
				return this.value;
			}
		};
		System.out.println(foo1.method());
		
		Foo foo2=()->{
			String value="Lambda scope value";
			return this.value;
		};
		System.out.println(foo2.method());
	}

}

@FunctionalInterface
interface Foo{
	public String method();
}
