package com.sandy3647.practise;

class Casio {
	
	public void add(int i, int j){
		System.out.println("Sum :" + (i+j));
	}
	
	public void add(int i, int j, int k){
		System.out.println("Sum :" + (i+j+k));
	}
	public void add(int i, int j, int k, int l){
		System.out.println("Sum :" + i+j+k+l);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio c1 = new Casio();
		c1.add(10, 20);
		c1.add(10, 20, 30);
	}

}
