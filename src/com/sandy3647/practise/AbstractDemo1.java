package com.sandy3647.practise;

abstract class Writer {
	public abstract void write();
}

class Pencil extends Writer {
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pencil");
	}
}

class Pen extends Writer {
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pen");
	}
}

class Printer{
	public void show(Writer pc) {
		pc.write();
	}
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj = new Printer();
		
		Writer pc = new Pencil();
		
		obj.show(pc);
		
		pc = new Pen();
		
		obj.show(pc);		
		
	}

}
