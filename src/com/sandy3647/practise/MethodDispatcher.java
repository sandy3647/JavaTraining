package com.sandy3647.practise;
class A2 {
	public void show() {
		System.out.println("Inside A2");
	}
}

class B2 extends A2{
	public void show() {
		System.out.println("Inside B2");
	}
	public void config() {
		System.out.println("Inside B2 Config");
	}
}

class C2 extends A2 {
	public void show() {
		System.out.println("Inside C2");
	}
}

public class MethodDispatcher {
	// compile and runtime polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a2 = new B2(); // this is runtime polymorphism which show() to be called is decided at runtime
		a2.show(); // the object is of B2 so the show() method from B2 is executed
		// a2.config(); this will not work because the a2 reference class does not identify the config() method
		
		a2 = new C2();
		a2.show(); //Dynamic method dispatch, uses runtime polymorphism
	}

}
