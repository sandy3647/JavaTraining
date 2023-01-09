package com.sandy3647.test;

import java.io.BufferedReader;
import java.io.InputStreamReader; //all the resources must be closed

public class UserInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a user input");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("The input string " + n);
		// br.close();

		// java 1.7 and later

		try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) { // we dont have to write the
																							// finally block to close
																							// the resources
			int n1 = Integer.parseInt(br1.readLine());
			System.out.println("The input string " + n1);
		}
	}

}
