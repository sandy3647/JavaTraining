package com.sandy3647.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>{
	String name;
	int rollNum;
	int marks;
	public Students(String name, int rollNum, int marks) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNum=" + rollNum + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return name.length() > o.name.length() ? 1 : -1;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> studs = new ArrayList<>();
		
		studs.add(new Students("Sumedh", 31, 99));
		studs.add(new Students("Sandeep", 10, 88));
		studs.add(new Students("Sneha", 15, 77));
		
		System.out.println("---------List sorted with name length--------------");
		Collections.sort(studs);
		for(Students s1 : studs) {
			System.out.println(s1.toString());
		}
		
		System.out.println("---------Override comparable with comparator and sort by rollNum--------------");
		
		Collections.sort(studs, (i, j) -> {return i.rollNum > j.rollNum ? 1 : -1;});
		for(Students s1 : studs) {
			System.out.println(s1.toString());
		}
	}

}
