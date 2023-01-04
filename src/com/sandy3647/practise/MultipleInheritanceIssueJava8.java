package com.sandy3647.practise;
//since we have more methods in interfaces there could be ambiguity issues which ccan be resolved using interface names and methods
interface Demo1 {
	void show();
	default void abc() {
		System.out.println("Inside Demo Interface");
	}
	
}

interface Mydemo1 {
	default void abc() {
		System.out.println("Inside MyDemo Interface");
	}
	
}

class Xyz implements Demo1, Mydemo1 {
	public void show() {
		System.out.println("Inside the Xyz class method");
	}
	@Override
	public void abc() {
		Demo1.super.abc();
		Mydemo1.super.abc();
	}
}
public class MultipleInheritanceIssueJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz ab = new Xyz();
		ab.show();
		ab.abc();
	}

}
