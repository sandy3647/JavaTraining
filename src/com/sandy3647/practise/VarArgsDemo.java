package com.sandy3647.practise;

class Calc1 {
	
	public int add(int i, int j) {
		int result = i+j;
		return result;
	}
	
	public int addn(int...n) {
		int result = 0;
		for(int k : n)
			result += k;
		return result;
	}
}
public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c1 = new Calc1();
		
		System.out.println(c1.add(5, 6));
		
		System.out.println(c1.addn(5, 6, 7, 8, 9));
		
		System.out.println(c1.addn(8, 9, 10, 11, 12));
		
		System.out.println(c1.addn(8, 9, 10, 11, 12, 13, 14));
		
		System.out.println(c1.addn(5));

	}

}
