package com.sandy3647.practise;

/*
 * You cannot instantiate abstract class
 * Abstract methods need abstract class
 * If you extend a abstract class you need to implement abstract methods
 */
abstract class Human {
	public abstract void eat();
	public void sleep() {
		
	}
}
class Man extends Human { // its called a concrete class
	public void eat() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Man();
	}

}
