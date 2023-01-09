package com.sandy3647.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<>();
		values.add(10);
		values.add(5);
		values.add(8);
		values.add(3);
		values.add(1);
		
		Collections.sort(values);
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		Collections.reverse(values);
		
		for(Integer i : values) {
			System.out.println(i);
		}
	}

}
