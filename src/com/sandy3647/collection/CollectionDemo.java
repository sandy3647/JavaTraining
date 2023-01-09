package com.sandy3647.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection cl = new ArrayList();
		cl.add(9);
		cl.add(10);
		cl.add(11);
		
		Iterator it = cl.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
