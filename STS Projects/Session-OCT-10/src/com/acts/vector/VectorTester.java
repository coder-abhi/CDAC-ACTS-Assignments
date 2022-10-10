package com.acts.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTester {
public static void main(String[] args) {
	Vector<Integer> vect = new Vector<Integer>();
//	System.out.println(vect.capacity());
	vect.add(10);
	vect.add(12);
	vect.add(10);
	vect.add(24);
	vect.add(25);
	vect.add(34);
	vect.add(1);
	vect.add(5);
	vect.add(-1);

	
	
//	System.out.println(vect);
//	Vector<> vect2 = new Vector<Integer>(10,15);
//	vect2 = vect.clone();
//	System.out.println(vect2);
	
	// Vector to Array
	/*
	Integer[] arr = new Integer[16];
	Vector<Integer> vect3 = new Vector<Integer>();
	
	vect.copyInto(arr);
	
	System.out.println(vect);
	System.out.println(Arrays.toString(arr));
	*/
	
	// Vector to Enum
	
	/*
	Enumeration<Integer> en =  vect.elements();
	
	System.out.println(en.nextElement());
	*/
	
	/*
	
	System.out.println(vect.capacity());
	vect.ensureCapacity(16);
	System.out.println(vect.capacity());
	*/
	
//	for(Integer in : vect) {
//		System.out.println(in.hashCode());
//	}
	
//	vect.forEach({);
	
//}
	
//	Iterator<Integer> it = vect.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next().hashCode());
//	}
	
	
//	System.out.println(vect.hashCode());
//	System.out.println(vect.hashCode());
	
	System.out.println(vect.indexOf(10));
	System.out.println(vect.remove((Integer)25));
	vect.removeElement(10);
	System.out.println(vect);
	System.out.println(vect.indexOf(10));
	
//	System.out.println(index);
}
}
