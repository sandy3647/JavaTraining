package com.sandy3647.practise;

class A1 {
	int i;
	public void show() {
		System.out.println("Inside A :" + i);
	}
}

class B1 extends A1 {
	int i;
	@Override
	public void show() {
		super.i = 10; //assign the values to parent class using super keyword
		super.show(); //we can call the super class methods with super keyword
		System.out.println("Inside B :" + i);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		b.show(); /* the child method overrides the super class method 
		it happens without @override keyword, we use override to avoid compiletime mistakes in naming functions*/
	}

}
