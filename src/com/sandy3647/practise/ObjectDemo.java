package com.sandy3647.practise;

class Calc {
	//class is a blue print
	int num1;
	int num2;
	int result;
	
	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;//this keyword is for instance variables
	}
}

public class ObjectDemo {
	
	public static void main(String[] args) {
		Calc obj = new Calc(7, 8); //knows something(it know the data values) and does something
		
		System.out.println("Value of Obj.num1 : " + obj.num1);
		System.out.println("Value of Obj.num2 : " + obj.num2);
	}

}
