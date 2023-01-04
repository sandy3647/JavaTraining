package com.sandy3647.practise;

interface WriterInt {
	void write(); // by default all methods are public and abstract, always better to use interfaces if you dont want to define methods
}

class Pencil1 implements WriterInt {
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pencil");
	}
}

class Pen1 implements WriterInt {
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pen");
	}
}

class Printer1{
	public void show(Writer pc) {
		pc.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
