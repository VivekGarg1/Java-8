package com.home.functional.interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {

	public abstract void m1();
	//If we trying to declare one more method then it will give error because it is annotated with @FunctionalInterface
	//public abstract void m2();
	
	//But we can keep Object class methods with @FunctionalInterface
	public abstract int hashCode();
	public boolean equals(Object obj);
	
}
