package com.sandy3647.practise;

class Anon {
	public void show() {
		System.out.println("Inside A");
	}
}
//anonymous classes with interface examples

interface Abc {
	void show();
}
public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anon av = new Anon();
		av.show();
		// we use anonymous class when we want to override some methods only temporarily
		
		Anon avn = new Anon() {// anonymous classes
			public void show() {
				System.out.println("Its to temporarily override the method");
			}
		};
		avn.show();
		
		Abc iabc = new Abc() { //you dont have to write a separate class just to implements some methods which needs no reuse
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Inplements interface in anonymous class");
			}
		};
		
		iabc.show();

	}

}
