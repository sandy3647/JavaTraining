package com.sandy3647.practise;
/*
 * Two levels of a inheritance 
 * Is A : Dog is a animal
 * Has A : Bathroom has a tub
 */
class Calculator { //super
	public int add(int i, int j) {
		return i+j;
	}
}

class CalculatorAdvance extends Calculator { // sub
	
	public int sub(int i, int j) {
		return i-j;
	}
}

class CalculatorVeryAdvance extends CalculatorAdvance { // sub
	
	public int multiply(int i, int j) {
		return i*j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorVeryAdvance c1 = new CalculatorVeryAdvance();
		System.out.println(c1.add(7, 8));
		System.out.println(c1.sub(7, 8));
		System.out.println(c1.multiply(7, 8));
	}

}
