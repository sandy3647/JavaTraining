package com.sandy3647.collection;
/*
 * HashTable is Synchronized and HashMap is not Synchronized
 */
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> maps = new HashMap<>(); //there is no sequence maintained
		
		maps.put("name", "lata");
		maps.put("role", "CEO");
		maps.put("salary", "30000");
		
		for(String key : maps.keySet()) {
			System.out.println(key + " " + maps.get(key));
		}
	}

}
