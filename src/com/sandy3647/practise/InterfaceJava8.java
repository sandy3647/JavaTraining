package com.sandy3647.practise;

//in abstract classes we can define and declare methods
//In Java 1.7 and below inside interface we cannot define methods
//In java 1.8 we can define methods, so we can go and use interfaces instead of abstract classes goind forward
//We can have one or more default methods in the interfaces

@FunctionalInterface // yes its a functional interface and it has only one abstract method and one or
						// more default methods
interface Demo {
	void show();

	default void abc() {
		System.out.println("Inside ABC");
	}
	default void xyz() {
		System.out.println("Inside ABC");
	}
}

class DemoImp implements Demo {
	public void show() {
		System.out.println("Inside DemoImpl");
	}

	// we can also override default methods
	public void abc() {
		System.out.println("Inside DemoImpl ABC");
	}
}

public class InterfaceJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoImp d1 = new DemoImp();
		d1.show();
		d1.abc();
		d1.xyz();

	}

}
