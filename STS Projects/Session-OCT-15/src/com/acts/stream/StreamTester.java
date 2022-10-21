package com.acts.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTester {

	public static void main(String[] args) {
		// Sort Ascending 
		
		Integer arr[] = {15,25,67,11,34,31,02,99,11};
		
		// Sorting Ascending
//		List<Integer> list2 = Arrays.stream(arr).sorted().collect(Collectors.toList());

		// Descending Sorting
//		List<Integer> list2 = Arrays.stream(arr).sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		
		// Finding Even
//		List<Integer> listSum = Arrays.stream(arr).filter(x -> x%2==0).collect(Collectors.toList());
		
		//
//		List<Integer> list3 = Arrays.stream(arr).collect(Collectors.)
		
//		System.out.println(listSum);

		
		

		
		
		
		
		
		Integer int2 = Arrays.stream(arr).filter(x -> x == 67).findFirst().get();
		
//		List<String> strList = Arrays.stream(str).sorted().collect(Collectors.toList());
//		String str[] = {"Abhi", "Deepesh", "Bhushan", "Bhavesh"};
//		
		
	}
	
}