package com.sandy3647.practise;

//int , float, double
//Integer

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5; //primitive data types
		Integer ii = new Integer(i); //putting a primitive data type in Object is called Boxing or Wrapping
		int j = ii.intValue(); //unboxing and unwrapping
		
		Integer k = i; //autoboxing or autowrapping 
		int value = k; /*autounboxing or autounwrapping, primitive works faster, 
		hybernate and collection API's use wrapper classes so need of some frameworks*/
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
