package com.gs.list;

import java.util.Vector;

import org.junit.Test;

public class VectorTest {
	
	@Test
	public void testVector() {
		Vector<String> vector = new Vector<String>();
		vector.add("item1");
		vector.addElement("item2");
		vector.add(1, "item3");
		if (vector.size() == 0) {
			System.out.println("vector is empty!");
		}
		if (!vector.isEmpty()) {
			System.out.println(vector.get(0));
			// System.out.println(vector.get(3)); // ArrayIndexOutOfBoundsException
		}
		vector.remove(2);
		vector.remove("item3");
		vector.indexOf("item1");
		vector.lastIndexOf("item1");
		vector.contains("item1");
		
		for (int i = 0, size = vector.size(); i < size; i++) {
			System.out.println(vector.get(i));
		}
		
		for (String s : vector) {
			System.out.println(s);
		}
		
		vector.clear();
	}

}
