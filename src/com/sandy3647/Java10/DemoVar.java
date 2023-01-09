package com.sandy3647.Java10;
class Students {
	// var j=10; this is not allowed
	public void printclass() {
		var i =10;
	}
}

public class DemoVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10; //var is a local instantiale variable can be used in java 10
		//var i; this is not allowed
		
		int var = 20;
		System.out.println("var as as data type : " + i);
		
		System.out.println("var as as variable name : " +var);
		
		int nums[] = new int[10];
		
		var nums1 = new int[10];

	}

}
