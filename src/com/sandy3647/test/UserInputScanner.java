package com.sandy3647.test;

//buffer reader
//scanner
import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the data :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The input data : " + n);
		sc.close();
	}

}
