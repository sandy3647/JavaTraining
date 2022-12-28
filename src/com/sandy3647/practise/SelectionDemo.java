package com.sandy3647.practise;

public class SelectionDemo {
	/*
	 * switch
	 * if
	 * ternary operator
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		if( n%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		String evenOrOdd = (n%2==0)? "Even" : "Odd";
		
		System.out.println("The number n is :" + evenOrOdd);
		
		String k = "abc";
		//In version 1.7 and upper, the switch supports the string values. The doubles are not supported in switch
		switch (k) {
		case "abc" : System.out.println("A");
		break;
		case "def" : System.out.println("B");
		break;
		case "ijk" : System.out.println("C");
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
	}

}
