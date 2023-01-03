package com.sandy3647.practise;

//binding the data to the methods is called data encapsulation, also keep data safe
class StudentEncap {
	private int rollNum;
	private String name;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		System.out.println("RollNum changes");
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEncap s1 = new StudentEncap();
		s1.setRollNum(10);
		s1.setName("Sumedh");
		
		System.out.println(s1.getName());
	}

}
