package com.sandy3647.practise;

public class JumpDemo {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			
			if(i == 7) {
				continue; // skips the current iteration
			}
			System.out.println("The value of i " + i);
		}
		
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i <= 10; i++) {
			
			if(i == 7) {
				break; // skips the entire loop
			}
			System.out.println("The value of i " + i);
		}
	}

}
