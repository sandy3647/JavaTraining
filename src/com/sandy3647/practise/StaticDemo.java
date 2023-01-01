package com.sandy3647.practise;

class Emp{
	int eid;
	int salary;
	static String ceo; //goes into class loader memory rather then heap memory, you can use the class name or object name to initialize it
	//but preference is to use the class name
	
	//the static bloc is only executed once when you load the class, is used to initialize the static variables
	//below statis blocks are executed in sequence from top to down so value of ceo is larry
	static {
		ceo = "page";
	}
	static {
		ceo = "larry";
	}
	
	public Emp() { //when we create the objects
		eid = 7;
		salary = 70000;
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp sneha = new Emp();
		Emp sandy = new Emp();
		sneha.show();
		sandy.show();
	}

}
