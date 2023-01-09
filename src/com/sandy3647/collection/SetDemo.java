package com.sandy3647.collection;
/*
 * Sets store always the unique values and the set do not return the values in the order of entry they return the nearest values for fetch
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> values = new HashSet<>();
		
		System.out.println(values.add(10));
		System.out.println(values.add(50));
		System.out.println(values.add(90));
		System.out.println(values.add(10));
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		System.out.println("------------Demo Tree set--------------");
		//the tree set always stores the values in the sorted way
		
		values = new TreeSet<>();
		System.out.println(values.add(200));
		System.out.println(values.add(1000));
		System.out.println(values.add(2000));
		System.out.println(values.add(90));
		for(Integer i : values) {
			System.out.println(i);
		}
		
	}

}
