package com.sandy3647.practise;
/*
 * Inner classes
 * Static classes
 * member classes
 * Anonymous class
 * 
 * 
 */
//below classes will generate different class files. The file for inner class will be Outer$Inner.class 
class Outer {
	int a;
	public void show(){
		System.out.println("Outer class");
	}
	class Inner {
		public void display() {
			System.out.println("Inner class");
		}
	}
	
	static class InnerStat {
		public void displayStat() {
			System.out.println("Inner Static  class");
		}
	}
}
public class InnerDemo {
	// we can have variables, methods, classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner inn = obj.new Inner();
		
		inn.display();
		
		Outer.InnerStat ins = new Outer.InnerStat();
		ins.displayStat();
	}

}
