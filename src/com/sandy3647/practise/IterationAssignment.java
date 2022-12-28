package com.sandy3647.practise;

public class IterationAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 1; k <= 6; k++) {
			for(int m=1; m <= k; m++) {
				System.out.print(m);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		
		for(int k = 65; k <= 71; k++) {
			for(int m = 65; m <= k; m++) {
				System.out.print((char)m);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		
		for(int k = 1; k <= 4; k++) {
			if(k == 1 || k == 4) {
				for(int j = 1; j <= 4; j++) {
					System.out.print("$ ");
				}
				System.out.println();
			} else {
				System.out.println("$     $ ");
			}
		}
	}

}
