package com.acts.searchAlgoTester;
import com.acts.searchAlgo.BinarySearch;
public class BinarySearchTester {

	public static void main(String[] args) {
		int arr[] = {10,36};
//		System.out.println(BinarySearch.searchRecursive(arr, 0, arr.length-1, 65));
		System.out.println(BinarySearch.searchIterative(arr, 0, arr.length-1, 10));
	}

}
