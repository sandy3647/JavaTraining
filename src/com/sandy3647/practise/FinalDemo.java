package com.sandy3647.practise;
/*
 * Final with variable 
 * Final with class
 * Final with Method
 * 
 */

final class A3 { // so that no other classes dont extend my class
	//final methods cannot be overridden
	int DAY;
	public final void show() {
		this.DAY = 10; // once you assign to the final var you cannot change it
		//DAY = 19; not allowed
	}
}
class B3 { 
	final int DAY;
	public B3() {
		DAY = 10; // once you assign to the final var you cannot change it
		//DAY = 19; not allowed
	}
}
class C3 {
	final int DAY;
	public C3() {
		DAY = 10; // once you assign to the final var you cannot change it
		//DAY = 19; not allowed
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
