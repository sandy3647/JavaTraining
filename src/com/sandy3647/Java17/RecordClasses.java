package com.sandy3647.Java17;

import java.util.Objects;

/*class Alien {
	private final int id;
	private final String name;
	public Alien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Alien a1 = (Alien) obj;
		
		return id == a1.id && Objects.equals(name, a1.name);
	}
	
	
}*/
//record calsses cannot extent other classes they can implement interfaces, we can create methods these are immutable objects
//all the variables are private and final
record Alien(int id, String name) {
	
	//canonical constructors these are default constructors
	/*
	 * public Alien(int id, String name) { this.id = id; this.name = name; }
	 */
	
	//below is calles a compact canonical constructors. no assignment needed
	public Alien {
		if(id == 0)
				throw new IllegalArgumentException();
	}
}

public class RecordClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a1 = new Alien(1, "Sneha");
		
		Alien a2 = new Alien(1, "Sneha");
		
		System.out.println(a1.equals(a2));
		
		System.out.println(a1.toString());
	}

}
