package com.sandy3647.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<>();
		values.add(456);
		values.add(239);
		values.add(931);
		values.add(863);
		
		Comparator<Integer> t = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		Collections.sort(values, t);
		
		for(Integer i : values) {
			System.out.println(i);
		}
	}

}
