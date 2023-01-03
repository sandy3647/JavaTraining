package com.sandy3647.practise;

class A {
	public A() {
		System.out.println("inside A");
	}
	public A(int i) {
		System.out.println("inside A int");
	}
}

class B extends A {
	public B() {
		super(5); //by default the super methods exist
		System.out.println("inside B");
	}
	public B(int i) {
		super(i); //by default the super() methods exist, we need to change it to call the parameterized constructors
		System.out.println("inside B int");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(5);
		
		B c = new B();
		
	}

}
