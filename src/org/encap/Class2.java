package org.encap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class2 {
	
	public static void main(String[] args) {
		
//		Clasa1 c = new Clasa1();
//		c.setName("ajith");
//		c.setId(3000);
//		String name = c.getName();
//		System.out.println(name);
//		int id = c.getId();
//		System.out.println(id);
	
	Clasa1 c1 = new Clasa1();
	c1.setName("ajith");
	c1.setId(1000);
	
	Clasa1 c2 = new Clasa1();
	c2.setName("vijay");
	c2.setId(2000);
	
	
	List<Clasa1> v = new ArrayList<>();
	v.add(c1);
	v.add(c2);
	
	for (int i = 0; i < v.size(); i++) {
		Clasa1 clasa1 = v.get(i);
		System.out.println(clasa1.getName());
		System.out.println(clasa1.getId());
		
	}
	System.out.println("set");
	
	Set<Clasa1> d = new HashSet<>();
	d.add(c1);
	d.add(c2);
	
	for (Clasa1 clasa1 : d) {
		System.out.println(clasa1.getName());
		System.out.println(clasa1.getId());
	}
	
	System.out.println("map");
	
	Map<Clasa1, String> b = new LinkedHashMap<>();
	
	b.put(c1, "ashok");
	b.put(c2, "kumar");
	 Set<Entry<Clasa1, String>> n = b.entrySet();
	 for (Entry<Clasa1, String> entry : n) {
		 System.out.println(entry.getValue());
		 //System.out.println(entry.getKey().getId());
		
	}
	
	
	}
	
		
	}


