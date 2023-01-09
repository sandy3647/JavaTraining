package com.sandy3647.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List values = new ArrayList();
		values.add(1);
		values.add(3);
		values.add("ListDemo");
		values.add(1, "NewIns");
		
		for(Object obj : values) {
			System.out.println(obj);
		}
		
	}

}
