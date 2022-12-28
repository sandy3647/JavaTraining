package com.sandy3647.practise;

public class IterationDemo {
	/*
	 * while
	 * do while
	 * for
	 * foreach enhanced for loop
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i < 5) {
			System.out.println("Hello");
			i++;
		}
		
		int j = 0;
		do {
			System.out.println("World");
			j++;
		} while (j < 5);
		
		for(int k = 0; k < 5; k++) {
			System.out.println("Inside for");
		}
	}

}
