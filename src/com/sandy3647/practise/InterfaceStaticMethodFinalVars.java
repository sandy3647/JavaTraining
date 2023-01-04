package com.sandy3647.practise;

//from Java 8 we can have static methods in the interfaces
//We can also have variables in interfaces but by default all variables are final

interface Demo12 {
	int num = 9; // by default these are final we cannot change them
	static void show() {
		System.out.println("Inside the show method");
	}
}
public class InterfaceStaticMethodFinalVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12.show(); // we can call statis methods inside the interface directlyt without using the objects
		System.out.println(Demo12.num);

	}

}
